package com.hospital.patients.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder//design pattern
public class Inc {
    private UUID id ;
    private String firstName;

    private  int IncNo ;
}
