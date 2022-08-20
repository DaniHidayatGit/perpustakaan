package com.example.demo.repository;

import com.example.demo.model.Petugas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetugasRepository extends JpaRepository<Petugas, Integer> {
}
