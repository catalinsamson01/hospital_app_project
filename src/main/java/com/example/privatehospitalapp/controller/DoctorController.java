package com.example.privatehospitalapp.controller;

import com.example.privatehospitalapp.entity.Doctor;
import com.example.privatehospitalapp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @PostMapping()
    public String addDoctor(@ModelAttribute Doctor doctor){
        Doctor savedDoctor = doctorService.saveDoctor(doctor);
        return "home";
    }

    @GetMapping()
    public String showDoctors(final ModelMap modelMap){
        List<Doctor> doctors = doctorService.getAllDoctors();
        modelMap.addAttribute("doctors", doctors);
        return "Doctors:";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Doctor> getDoctorById(@PathVariable Long id){
        Doctor doctor = doctorService.searchDoctorById(id);
        if(id==1) {
            throw new RuntimeException("The doctor with id " + id + " doesn' exist.");
        }
        return ResponseEntity.ok(doctor);
    }

//    @GetMapping("/doctors")
//    public String getDoctors(@RequestParam(name = "selectedSpecialty", defaultValue = "toate") String selectedSpecialty, Model model) {
//        // Obține lista de doctori în funcție de specialitate (poate dintr-un serviciu sau bază de date)
//        List<Doctor> doctors = doctorService.getDoctorBySpecialization(selectedSpecialty);
//
//        // Adaugă lista de doctori în model pentru a fi afișată în HTML
//        model.addAttribute("doctors", doctors);

//        return "doctors"; // Numele șablonului Thymeleaf (poate fi diferit în funcție de configurație)

    @DeleteMapping("/{id}")
    public void deleteDoctorById(@PathVariable Long id){
        doctorService.deleteDoctorById(id);
    }
}
