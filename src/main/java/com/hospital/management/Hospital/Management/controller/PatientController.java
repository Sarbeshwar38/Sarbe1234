package com.hospital.management.Hospital.Management.controller;

import com.hospital.management.Hospital.Management.entity.Patient;
import com.hospital.management.Hospital.Management.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/patient")
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/savedPatient")
    public ResponseEntity<Patient> createPatient(@RequestBody Patient patient) {
        Patient savedPatient = patientService.savePatient(patient);
        return new ResponseEntity<>(savedPatient, HttpStatus.CREATED);

    }
    @PostMapping("/getPatient")
    public List<Patient> getAllPatients() {
        List<Patient> allPatient = patientService.getPatient();
        return new ResponseEntity<>(allPatient,HttpStatus.CREATED).getBody();
    }
    

}
