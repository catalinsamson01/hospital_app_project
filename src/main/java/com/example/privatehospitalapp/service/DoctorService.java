package com.example.privatehospitalapp.service;

import com.example.privatehospitalapp.dao.DoctorRepository;
import com.example.privatehospitalapp.entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;

@Service
public class DoctorService {

    @Autowired
    public DoctorRepository doctorRepository;

    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public Doctor searchDoctorById(Long id){
        Doctor doctor = doctorRepository.findById(id).get();
        return doctor;
    }

    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }

    public void deleteDoctorById(Long id){
        doctorRepository.deleteById(id);
    }
}
