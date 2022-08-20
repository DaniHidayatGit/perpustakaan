package com.example.demo.repository;

import com.example.demo.model.Anggota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnggotaRepository extends JpaRepository<Anggota, Integer> {
}
