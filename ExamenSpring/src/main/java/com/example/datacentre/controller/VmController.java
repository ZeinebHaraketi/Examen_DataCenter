package com.example.datacentre.controller;

import com.example.datacentre.entity.VirtualMachine;
import com.example.datacentre.services.VmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vm")
public class VmController {

    @Autowired
    VmService vmService;

    @PostMapping("/addV")
    @ResponseBody
    public int ajouterVm(VirtualMachine vm){
        return vmService.ajouterVm(vm);
    }

    @PutMapping("/demarrer/{idvm}")
    @ResponseBody
    public void demarrerInstanceUser(@PathVariable("idvm") int idvm){
        vmService.demarrerInstanceUser(idvm);
    }

    @PutMapping("/arreter/{idvm}")
    @ResponseBody
    public void arreterInstanceUser(@PathVariable("idvm") int idvm){
        vmService.arreterInstanceUser(idvm);
    }

    @PutMapping("/affecterVmU/{id-vm}/{id-user}")
    public void affecterVmuser(@PathVariable("id-vm") int idVm, @PathVariable("id-user") int idUser){
        vmService.affecterVmuser(idVm,idUser);
    }

    @PutMapping("/affecterV/{id-vm}")
    public void affecterVm(@PathVariable("id-vm") int idVm){
        vmService.affecterVm(idVm);
    }
}
