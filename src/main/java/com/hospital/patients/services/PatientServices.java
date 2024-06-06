package com.hospital.patients.services;

import com.hospital.patients.model.Patient;
import com.hospital.patients.model.PatientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service  //used for service layer .
public class PatientServices {

@Autowired
    private PatientModel patientModel ;
public Patient printName(String name){
        String n = patientModel.getNames()
                .stream()
                .filter(i -> i == name)
                .findAny()
                .orElse("Nothing");
Patient b = new Patient();
b.setName(n.toUpperCase());
return b;
    }

    public List<Patient>getPatients (){
 ArrayList <Patient> list = new ArrayList<>();
patientModel.getNames().stream().forEach(name ->  list.add(new Patient(name) ));
return  list;
    }



}
