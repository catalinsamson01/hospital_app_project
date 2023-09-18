package com.example.privatehospitalapp.controller;

import com.example.privatehospitalapp.entity.Patient;
import com.example.privatehospitalapp.entity.Rent;
import com.example.privatehospitalapp.service.PatientService;
import com.example.privatehospitalapp.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/rents")
public class RentController {

    @Autowired
    private RentService rentService;

    @GetMapping()
    public String showRents(final ModelMap modelMap){
        List<Rent> rents = rentService.getAllRents();
        modelMap.addAttribute("rents", rents);
        return "rent";
    }
}
