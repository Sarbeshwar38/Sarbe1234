package com.hospital.management.Hospital.Management.service;

import com.hospital.management.Hospital.Management.entity.Patient;
import com.hospital.management.Hospital.Management.exception.ResourceNotFoundException;
import com.hospital.management.Hospital.Management.repository.PatientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
    public Patient savePatient(Patient patient) {
        Patient savedPatient = patientRepository.save(patient);
        return savedPatient;
    }
    public List<Patient> getPatient() {
        List<Patient> allPatient = patientRepository.findAll();
        return allPatient;

    }

}




