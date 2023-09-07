package com.example.privatehospitalapp.entity;

import jakarta.persistence.*;
import lombok.*;

import javax.print.Doc;
import java.time.LocalDate;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    private LocalDate dateStart;
    private LocalDate dateEnd;
    private double totalPrice;
}
