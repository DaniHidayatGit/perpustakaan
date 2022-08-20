package com.example.demo.service;

import com.example.demo.model.Peminjaman;
import com.example.demo.model.dto.PeminjamanDto;
import com.example.demo.model.mapper.PeminjamanMapper;
import com.example.demo.repository.PeminjamanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeminjamanService {
    @Autowired
    PeminjamanRepository repository;

    public List<PeminjamanDto> findAll(){
        return PeminjamanMapper.INSTANCE.toDtoList(repository.findAll());
    }

    public PeminjamanDto findById(Integer id){
        return PeminjamanMapper.INSTANCE.toDto(
                repository.findById(id).orElseThrow(null)
        );
    }

    public PeminjamanDto create(PeminjamanDto param){
        return PeminjamanMapper.INSTANCE.toDto(
                repository.save(
                        PeminjamanMapper.INSTANCE.toEntity(param)
                )
        );
    }

    public boolean delete(Integer id){
        Peminjaman data = repository.findById(id).orElseThrow(null);
        try{
            repository.delete(data);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
