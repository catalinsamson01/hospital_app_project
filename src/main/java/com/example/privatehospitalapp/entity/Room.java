package com.example.privatehospitalapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int capacity;

    @OneToMany(mappedBy = "room")
    private List<Patient> patients;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

}
