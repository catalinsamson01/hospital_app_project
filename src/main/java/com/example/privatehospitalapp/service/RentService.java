package com.example.privatehospitalapp.service;

import com.example.privatehospitalapp.dao.RentRepository;
import com.example.privatehospitalapp.entity.Rent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentService {

    @Autowired
    public RentRepository rentRepository;

    public Rent saveRent(Rent rent){
        // create empty obj -> Rent newRent = new Rent();
        // update doctor -> newRent.set(doctor)
        // update patient -> newRent.set(patient)

        // update patient in patient table
            // Patient found = findById -> patient.id
            // found.setDoctorId(doctor.id)
            // patientRepo.save(found)
        return rentRepository.save(rent);
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
