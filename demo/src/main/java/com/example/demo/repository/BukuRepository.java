package com.example.demo.repository;

import com.example.demo.model.Buku;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BukuRepository extends JpaRepository<Buku, Integer> {
}
