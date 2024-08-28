package com.hospital.management.Hospital.Management.repository;

import com.hospital.management.Hospital.Management.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}