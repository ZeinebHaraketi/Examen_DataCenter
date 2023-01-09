package com.example.datacentre.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name="Datacenter")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Datacenter implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDs")
    private Integer idDs;

    private String region;

    @Column(name = "dateFabrication")
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date dateFabrication;

    private Integer capaciteDisque;

    private Integer espaceLibreDisque;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datacenter")
    private Set<VirtualMachine> virtualMachines;

}
