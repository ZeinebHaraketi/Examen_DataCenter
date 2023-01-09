package com.example.datacentre.services;

import com.example.datacentre.entity.Datacenter;
import com.example.datacentre.entity.Etat;
import com.example.datacentre.entity.Utilisateur;
import com.example.datacentre.entity.VirtualMachine;
import com.example.datacentre.repository.DataCenterRepo;
import com.example.datacentre.repository.UtilisateurRepo;
import com.example.datacentre.repository.VirtualMachineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class VmService implements  IVmService{

    @Autowired
    VirtualMachineRepo virtualMachineRepo;

    @Autowired
    UtilisateurRepo utilisateurRepo;

    @Autowired
    DataCenterRepo dataCenterRepo;

    @Override
    public int ajouterVm(VirtualMachine vm) {
        return virtualMachineRepo.save(vm).getIdVm();
    }

    @Override
    public void affecterVmuser(int idv, int iduser) {
       VirtualMachine vm= virtualMachineRepo.findById(idv).orElse(null);
        Utilisateur u= utilisateurRepo.findById(iduser).orElse(null);
        u.getVm().add(vm);
        utilisateurRepo.save(u);
    }

    @Override
    public void demarrerInstanceUser(int idvm) {
        VirtualMachine vm = virtualMachineRepo.findById(idvm).orElse(null);
        vm.setEtat(Etat.RUNNING);
        virtualMachineRepo.save(vm);
    }

    @Override
    public void arreterInstanceUser(int idvm) {
        VirtualMachine vm = virtualMachineRepo.findById(idvm).orElse(null);
        vm.setEtat(Etat.STOPPED);
        virtualMachineRepo.save(vm);
    }

    @Override
    @Transactional
    public void affecterVm(int idVm) {
        VirtualMachine vm = virtualMachineRepo.findById(idVm).orElse(null);
        for(Datacenter dataCenter:dataCenterRepo.findAll()){
            if(dataCenter.getEspaceLibreDisque() > vm.getTailleDisque()){
                int nouveauEspaceLibreDisque = dataCenter.getEspaceLibreDisque() - vm.getTailleDisque();
                dataCenter.setEspaceLibreDisque(nouveauEspaceLibreDisque);
                vm.setDatacenter(dataCenter);
            }
        }
    }
}
