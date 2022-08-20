package com.example.demo.service;

import com.example.demo.model.Peminjaman;
import com.example.demo.model.Pengembalian;
import com.example.demo.model.dto.PengembalianDto;
import com.example.demo.model.mapper.PengembalianMapper;
import com.example.demo.repository.PeminjamanRepository;
import com.example.demo.repository.PengembalianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PengembalianService {
    @Autowired
    PengembalianRepository repository;

    public List<PengembalianDto> findAll(){
        return PengembalianMapper.INSTANCE.toDtoList(repository.findAll());
    }

    public PengembalianDto findById(Integer id){
        return PengembalianMapper.INSTANCE.toDto(
                repository.findById(id).orElseThrow(null)
        );
    }

    public PengembalianDto create(PengembalianDto param){
        return PengembalianMapper.INSTANCE.toDto(
                repository.save(
                        PengembalianMapper.INSTANCE.toEntity(param)
                )
        );
    }

    public boolean delete(Integer id){
        Pengembalian data = repository.findById(id).orElseThrow(null);
        try{
            repository.delete(data);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
