package com.example.demo.model.mapper;

import com.example.demo.model.Penerbit;
import com.example.demo.model.dto.PenerbitDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PenerbitMapper {
    PenerbitMapper INSTANCE = Mappers.getMapper(PenerbitMapper.class);

    Penerbit toEntity(PenerbitDto e);

    PenerbitDto toDto(Penerbit e);

    List<PenerbitDto> toDtoList(List<Penerbit> e);
}
