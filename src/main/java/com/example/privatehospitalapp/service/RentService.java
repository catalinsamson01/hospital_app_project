package com.example.privatehospitalapp.service;

import com.example.privatehospitalapp.dao.DoctorRepository;
import com.example.privatehospitalapp.dao.PatientRepository;
import com.example.privatehospitalapp.dao.RentRepository;
import com.example.privatehospitalapp.entity.Doctor;
import com.example.privatehospitalapp.entity.Patient;
import com.example.privatehospitalapp.entity.Rent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RentService {

    @Autowired
    public RentRepository rentRepository;
    @Autowired
    public PatientRepository patientRepository;
    @Autowired
    public DoctorRepository doctorRepository;

    public Rent saveRent(Long patientId, Long doctorId){
        // Create an empty Rent object to store form data
        Rent newRent = new Rent();

        // Set Doctor to Rent obj
//        Optional<Doctor> chosenDoctor = doctorRepository.findById(Long.getLong(doctorId));
        Optional<Doctor> chosenDoctor = doctorRepository.findById(doctorId);
        if(chosenDoctor.isPresent())
            newRent.setDoctor(chosenDoctor.get());
        else
            newRent.setDoctor(null);

        // Update Patient with chosen Doctor
//        Optional<Patient> chosenPatient = patientRepository.findById(Long.getLong(patientId));
        Optional<Patient> chosenPatient = patientRepository.findById(patientId);
        if(chosenPatient.isPresent()) {
            chosenPatient.get().setDoctor(chosenDoctor.get());
            newRent.setPatient(chosenPatient.get());
            patientRepository.save(chosenPatient.get());
        }
        else
            newRent.setPatient(null);

        // Save each in corresponding tables
        rentRepository.save(newRent);

        // Return final Rent obj
        return newRent;
    }

    public Rent searchRentById(Long id){
        Rent rent = rentRepository.findById(id).get();
        return rent;
    }

    public List<Rent> getAllRents(){
        return rentRepository.findAll();
    }

    public void deleteRentById(Long id){
        rentRepository.deleteById(id);
    }
}
