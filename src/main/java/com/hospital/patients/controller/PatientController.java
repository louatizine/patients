package com.hospital.patients.controller;

import com.hospital.patients.model.Patient;
import com.hospital.patients.services.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientController {





    @Autowired // dependencies injection design pattern
    private PatientServices patientServices; //bean

    @GetMapping("/print-name")
    public ResponseEntity printPatientName(){
        return  ResponseEntity.ok(patientServices.printName("zine "));
    }

    @GetMapping("/get-patients")
    public ResponseEntity getPatients(){
        return  ResponseEntity.ok(patientServices.getPatients());
    }
    @PostMapping("/save")
    public ResponseEntity savePatient(@RequestBody Patient patient){
        return  ResponseEntity.ok(patient);
    }
}
