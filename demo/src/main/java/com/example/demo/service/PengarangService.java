package com.example.demo.service;

import com.example.demo.model.Pengarang;
import com.example.demo.model.dto.PengarangDto;
import com.example.demo.model.mapper.PengarangMapper;
import com.example.demo.repository.PengarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PengarangService {
    @Autowired
    PengarangRepository repository;

    public List<PengarangDto> findAll(){
        return PengarangMapper.INSTANCE.toDtoList(repository.findAll());
    }

    public PengarangDto findById(Integer id){
        return PengarangMapper.INSTANCE.toDto(
                repository.findById(id).orElseThrow(null)
        );
    }

    public PengarangDto create(PengarangDto param){
        return PengarangMapper.INSTANCE.toDto(
                repository.save(
                        PengarangMapper.INSTANCE.toEntity(param)
                )
        );
    }

    public boolean delete(Integer id){
        Pengarang data = repository.findById(id).orElseThrow(null);
        try{
            repository.delete(data);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
