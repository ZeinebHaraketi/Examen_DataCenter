package com.example.datacentre.services;

import com.example.datacentre.entity.Utilisateur;
import com.example.datacentre.entity.VirtualMachine;
import com.example.datacentre.repository.UtilisateurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UtilisateurService implements  IUtilisateurService{

    @Autowired
    UtilisateurRepo utilisateurRepo;

    @Override
    public void ajouterUtilisatur(Utilisateur u) {
        utilisateurRepo.save(u);
    }

    @Override
    public void demarrerInstanceUser(int idvm) {
        Utilisateur u= new Utilisateur();


    }
}
