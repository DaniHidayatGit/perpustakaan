package com.example.demo.service;

import com.example.demo.model.Pengembalian;
import com.example.demo.model.Petugas;
import com.example.demo.model.dto.PetugasDto;
import com.example.demo.model.mapper.PetugasMapper;
import com.example.demo.repository.PengembalianRepository;
import com.example.demo.repository.PetugasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetugasService {
    @Autowired
    PetugasRepository repository;

    public List<PetugasDto> findAll(){
        return PetugasMapper.INSTANCE.toDtoList(repository.findAll());
    }

    public PetugasDto findById(Integer id){
        return PetugasMapper.INSTANCE.toDto(
                repository.findById(id).orElseThrow(null)
        );
    }

    public PetugasDto create(PetugasDto param){
        return PetugasMapper.INSTANCE.toDto(
                repository.save(
                        PetugasMapper.INSTANCE.toEntity(param)
                )
        );
    }

    public boolean delete(Integer id){
        Petugas data = repository.findById(id).orElseThrow(null);
        try{
            repository.delete(data);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
