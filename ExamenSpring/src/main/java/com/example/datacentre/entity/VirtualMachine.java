package com.example.datacentre.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name="VirtualMachine")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class VirtualMachine implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idVm")
    private Integer idVm;

    private String os;

    private Integer tailleDisque;

    @Column(name = "etat")
    @Enumerated(EnumType.STRING)
    Etat etat;

    @ManyToOne
    Datacenter datacenter;

}
