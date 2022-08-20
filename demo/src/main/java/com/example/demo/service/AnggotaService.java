package com.example.demo.service;

import com.example.demo.model.Anggota;
import com.example.demo.model.dto.AnggotaDto;
import com.example.demo.model.mapper.AnggotaMapper;
import com.example.demo.repository.AnggotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnggotaService {
    @Autowired
    AnggotaRepository repository;

    public List<AnggotaDto> findAll(){
        return AnggotaMapper.INSTANCE.toDtoList(repository.findAll());
    }

    public AnggotaDto findById(Integer id){
        return AnggotaMapper.INSTANCE.toDto(
                repository.findById(id).orElseThrow(null)
        );
    }

    public AnggotaDto create(AnggotaDto param){
        return AnggotaMapper.INSTANCE.toDto(
                repository.save(
                        AnggotaMapper.INSTANCE.toEntity(param)
                )
        );
    }

    public boolean delete(Integer id){
        Anggota data = repository.findById(id).orElseThrow(null);
        try{
            repository.delete(data);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
