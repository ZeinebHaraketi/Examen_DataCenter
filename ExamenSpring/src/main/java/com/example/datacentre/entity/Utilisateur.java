package com.example.datacentre.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name="Utilisateur")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUser")
    private Integer idUser;

    private String nomUser;

    private String prenomUser;

    private String login;

    private String pwd;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<VirtualMachine> Vm;


}
