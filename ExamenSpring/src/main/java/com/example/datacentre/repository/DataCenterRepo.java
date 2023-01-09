package com.example.datacentre.repository;

import com.example.datacentre.entity.Datacenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataCenterRepo extends JpaRepository<Datacenter,Integer> {
    /*@Query(nativeQuery = true, value = "Select * from datacenter dc where dc.date_fabrication  > '2019-11-01' ")
    List<Datacenter> listerDataCenter();*/
}
