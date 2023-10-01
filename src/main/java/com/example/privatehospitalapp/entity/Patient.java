package com.example.privatehospitalapp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "patient")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String disease;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

//    public void setDoctorId(Long id){
//        doctor.getId();
//    }


}
