package com.hospital.patients.controller;

import com.hospital.patients.model.Inc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/inc")
public class IncControllers {
     @GetMapping("/getPatientInc")
     public  Inc getPatientINC(){
          Inc c = new Inc();
          c.setId(UUID.randomUUID());
          c.setIncNo(23520);
          c.setFirstName("zizou");
          return Inc.builder().build();
     }
}
