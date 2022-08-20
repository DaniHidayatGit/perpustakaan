package com.example.demo.model.mapper;

import com.example.demo.model.Anggota;
import com.example.demo.model.dto.AnggotaDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AnggotaMapper {
    AnggotaMapper INSTANCE = Mappers.getMapper(AnggotaMapper.class);

    Anggota toEntity(AnggotaDto e);

    AnggotaDto toDto(Anggota e);

    List<AnggotaDto> toDtoList(List<Anggota> e);
}
