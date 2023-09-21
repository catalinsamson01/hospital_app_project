package com.example.privatehospitalapp.dao;

import com.example.privatehospitalapp.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    @Override
    Doctor save(Doctor doctor);
    @Override
    Optional<Doctor> findById(Long id);
    @Override
    List<Doctor> findAll();
    @Override
    void deleteById(Long id);

    String getDoctorBySpecialization(Doctor doctor);
}
