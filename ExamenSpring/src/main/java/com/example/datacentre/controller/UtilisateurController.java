package com.example.datacentre.controller;

import com.example.datacentre.entity.Utilisateur;
import com.example.datacentre.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {

    @Autowired
    UtilisateurService utilisateurService;

    @PostMapping("/addU")
    @ResponseBody
    public void ajouterUtilisatur(@RequestBody  Utilisateur u) {
        utilisateurService.ajouterUtilisatur(u);
    }


    }
