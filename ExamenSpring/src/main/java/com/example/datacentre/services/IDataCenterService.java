package com.example.datacentre.services;

import com.example.datacentre.entity.Datacenter;

import java.util.List;

public interface IDataCenterService {

    public void ajouterDc(Datacenter datacenter);

    public List<Datacenter> listerDataCenter();
}
