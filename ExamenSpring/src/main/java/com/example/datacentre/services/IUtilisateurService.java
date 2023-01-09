package com.example.datacentre.services;

import com.example.datacentre.entity.Utilisateur;

public interface IUtilisateurService {

    public void ajouterUtilisatur(Utilisateur u);

    public void demarrerInstanceUser(int idvm);

}
