package com.example.demo.service;

import com.example.demo.model.Penerbit;
import com.example.demo.model.dto.PenerbitDto;
import com.example.demo.model.mapper.PenerbitMapper;
import com.example.demo.repository.PenerbitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PenerbitService {
    @Autowired
    PenerbitRepository repository;

    public List<PenerbitDto> findAll(){
        return PenerbitMapper.INSTANCE.toDtoList(repository.findAll());
    }

    public PenerbitDto findById(Integer id){
        return PenerbitMapper.INSTANCE.toDto(
                repository.findById(id).orElseThrow(null)
        );
    }

    public PenerbitDto create(PenerbitDto param){
        return PenerbitMapper.INSTANCE.toDto(
                repository.save(
                        PenerbitMapper.INSTANCE.toEntity(param)
                )
        );
    }

    public boolean delete(Integer id){
        Penerbit data = repository.findById(id).orElseThrow(null);
        try{
            repository.delete(data);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
