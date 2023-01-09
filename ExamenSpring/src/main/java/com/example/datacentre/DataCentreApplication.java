package com.example.datacentre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling
public class DataCentreApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataCentreApplication.class, args);
    }

}
