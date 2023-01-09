package com.example.datacentre.services;

import com.example.datacentre.entity.VirtualMachine;

public interface IVmService {

    public int ajouterVm(VirtualMachine vm);

    public void affecterVmuser(int idv, int iduser);

    public void demarrerInstanceUser(int idvm);

    public void arreterInstanceUser(int idvm);

    public void affecterVm(int idVm);

}
