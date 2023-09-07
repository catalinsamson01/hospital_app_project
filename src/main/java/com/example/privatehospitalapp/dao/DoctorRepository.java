package com.example.privatehospitalapp.dao;

import com.example.privatehospitalapp.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    Doctor save(Doctor doctor);

    Optional<Doctor> findById(Long id);
    List<Doctor> findAll();
    void deleteById(Long id);
}
