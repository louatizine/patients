package com.hospital.patients.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PatientModel {
    List<String> names= new ArrayList<>();

    PatientModel(){
        names.add("ahmed ");
        names.add("zine ");
        names.add("ali ");
    }
    public  List<String> getNames(){
        return names ;
    }
}
