package com.example.demo.service;

import com.example.demo.model.Buku;
import com.example.demo.model.dto.BukuDto;
import com.example.demo.model.mapper.BukuMapper;
import com.example.demo.repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BukuService {
    @Autowired
    BukuRepository repository;

    public List<BukuDto> findAll(){
        return BukuMapper.INSTANCE.toDtoList(repository.findAll());
    }

    public BukuDto findById(Integer id){
        return BukuMapper.INSTANCE.toDto(
                repository.findById(id).orElseThrow(null)
        );
    }

    public BukuDto create(BukuDto param){
        return BukuMapper.INSTANCE.toDto(
                repository.save(
                        BukuMapper.INSTANCE.toEntity(param)
                )
        );
    }

    public boolean delete(Integer id){
        Buku data = repository.findById(id).orElseThrow(null);
        try{
            repository.delete(data);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
