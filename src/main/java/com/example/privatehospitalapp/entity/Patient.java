package com.example.privatehospitalapp.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    private Long id;
    private String name;
    private String disease;
    private Doctor doctor;
    private HospitalRoom hospitalRoom;
}
