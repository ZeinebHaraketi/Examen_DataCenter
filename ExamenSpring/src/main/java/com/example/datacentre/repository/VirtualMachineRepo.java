package com.example.datacentre.repository;

import com.example.datacentre.entity.VirtualMachine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualMachineRepo extends JpaRepository<VirtualMachine,Integer> {
}
