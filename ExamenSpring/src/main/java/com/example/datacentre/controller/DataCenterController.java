package com.example.datacentre.controller;

import com.example.datacentre.entity.Datacenter;
import com.example.datacentre.entity.Utilisateur;
import com.example.datacentre.services.DataCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dc")
public class DataCenterController {

    @Autowired
    DataCenterService dataCenterService;

    @PostMapping("/addDc")
    @ResponseBody
    public void ajouterDc(@RequestBody Datacenter d) {
        dataCenterService.ajouterDc(d);
    }

    @GetMapping("/getDC")
    public List<Datacenter> getDataCenter(){
        return dataCenterService.listerDataCenter();
    }
}
