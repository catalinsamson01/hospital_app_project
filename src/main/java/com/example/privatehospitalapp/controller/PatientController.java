package com.example.privatehospitalapp.controller;

import com.example.privatehospitalapp.entity.Patient;
import com.example.privatehospitalapp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping()
    public String addPatient(@ModelAttribute Patient patient){
        Patient savedPatient = patientService.savePatient(patient);
        return "homePage";
    }

    @GetMapping()
    public String showPatients(final ModelMap modelMap){
        List<Patient> patients = patientService.getAllPatients();
        modelMap.addAttribute("patients", patients);
        return "Patients:";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable Long id){
        Patient patient = patientService.searchPatientById(id);
        if(id==1) {
            throw new RuntimeException("The patient with id " + id + " doesn' exist.");
        }
        return ResponseEntity.ok(patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatientById(@PathVariable Long id){
        patientService.deletePatientById(id);
    }


}
