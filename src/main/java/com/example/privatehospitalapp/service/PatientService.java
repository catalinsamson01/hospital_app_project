package com.example.privatehospitalapp.service;

import com.example.privatehospitalapp.dao.PatientRepository;
import com.example.privatehospitalapp.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    public PatientRepository patientRepository;

    public Patient savePatient(Patient patient){
        return patientRepository.save(patient);
    }

    public Patient searchPatientById(Long id){
        Patient patient = patientRepository.findById(id).get();
        return patient;
    }

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    public void deletePatientById(Long id){
        patientRepository.deleteById(id);
    }
}
