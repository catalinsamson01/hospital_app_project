package com.example.privatehospitalapp.controller;

import com.example.privatehospitalapp.entity.Patient;
import com.example.privatehospitalapp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/add-patient")
    public String addPatient(@RequestParam String name, @RequestParam String lastName, @RequestParam String disease) {
        // Creează un obiect Patient cu datele primite din formular
        Patient patient = new Patient();
        patient.setName(name);
        patient.setLastName(lastName);
        patient.setDisease(disease);

        // Adaugă pacientul în baza de date
        patientService.savePatient(patient);

        // Redirectează către o pagină de succes sau de confirmare
        return "redirect:/success";
    }
}



