package com.example.demo.model.mapper;

import com.example.demo.model.Peminjaman;
import com.example.demo.model.dto.PeminjamanDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PeminjamanMapper {
    PeminjamanMapper INSTANCE = Mappers.getMapper(PeminjamanMapper.class);

    Peminjaman toEntity(PeminjamanDto e);

    PeminjamanDto toDto(Peminjaman e);

    List<PeminjamanDto> toDtoList(List<Peminjaman> e);
}
