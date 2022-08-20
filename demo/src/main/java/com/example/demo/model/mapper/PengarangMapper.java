package com.example.demo.model.mapper;

import com.example.demo.model.Pengarang;
import com.example.demo.model.dto.PengarangDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PengarangMapper {
    PengarangMapper INSTANCE = Mappers.getMapper(PengarangMapper.class);

    Pengarang toEntity(PengarangDto e);

    PengarangDto toDto(Pengarang e);

    List<PengarangDto> toDtoList(List<Pengarang> e);
}
