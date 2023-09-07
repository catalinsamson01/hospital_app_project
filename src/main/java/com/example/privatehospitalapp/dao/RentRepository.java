package com.example.privatehospitalapp.dao;

import com.example.privatehospitalapp.entity.Patient;
import com.example.privatehospitalapp.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RentRepository extends JpaRepository<Rent, Long> {

    Rent save(Rent rent);

    Optional<Rent> findById(Long id);

    List<Rent> findAll();

    void deleteById(Long id);
}
