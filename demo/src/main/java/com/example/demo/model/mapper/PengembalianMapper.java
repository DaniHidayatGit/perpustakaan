package com.example.demo.model.mapper;

import com.example.demo.model.Pengembalian;
import com.example.demo.model.dto.PengembalianDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PengembalianMapper {
    PengembalianMapper INSTANCE = Mappers.getMapper(PengembalianMapper.class);

    Pengembalian toEntity(PengembalianDto e);

    PengembalianDto toDto(Pengembalian e);

    List<PengembalianDto> toDtoList(List<Pengembalian> e);
}
