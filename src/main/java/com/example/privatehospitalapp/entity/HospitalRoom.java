package com.example.privatehospitalapp.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HospitalRoom {

    private Long id;
    private int capacity;
    private List<Patient> patients;
    private Doctor doctor;

}
