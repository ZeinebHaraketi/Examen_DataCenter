package com.example.datacentre.services;

import com.example.datacentre.entity.Datacenter;
import com.example.datacentre.entity.VirtualMachine;
import com.example.datacentre.repository.DataCenterRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DataCenterService implements IDataCenterService{
    @Autowired
    DataCenterRepo dataCenterRepo;


    @Override
    public void ajouterDc(Datacenter datacenter){
        dataCenterRepo.save(datacenter);
    }

    @Override
    public List<Datacenter> listerDataCenter() {
        return dataCenterRepo.findAll();
    }

    @Scheduled(cron = "*/10 * * * * *")
    public void getDataCenters(){
        for (Datacenter d: listerDataCenter()){
            log.info("Region Data Center: "+d.getRegion());
            for (VirtualMachine vm: d.getVirtualMachines()){
                log.info("OS VM:"+ vm.getOs());
            }
        }

    }
}
