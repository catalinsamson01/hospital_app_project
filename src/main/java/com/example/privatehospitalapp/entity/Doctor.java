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
public class Doctor {

    private Long id;
    private String name;
    private String specialization;
    private List<Patient> patients;
    private List<HospitalRoom> hospitalRooms;
}
