package com.example.demo.model.mapper;

import com.example.demo.model.Buku;
import com.example.demo.model.dto.BukuDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BukuMapper {
    BukuMapper INSTANCE = Mappers.getMapper(BukuMapper.class);

    Buku toEntity(BukuDto e);

    BukuDto toDto(Buku e);

    List<BukuDto> toDtoList(List<Buku> e);
}
