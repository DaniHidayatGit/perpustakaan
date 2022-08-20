package com.example.demo.model.mapper;

import com.example.demo.model.Petugas;
import com.example.demo.model.dto.PetugasDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PetugasMapper {
    PetugasMapper INSTANCE = Mappers.getMapper(PetugasMapper.class);

    Petugas toEntity(PetugasDto e);

    PetugasDto toDto(Petugas e);

    List<PetugasDto> toDtoList(List<Petugas> e);
}
