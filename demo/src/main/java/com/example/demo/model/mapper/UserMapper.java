package com.example.demo.model.mapper;

import com.example.demo.model.User;
import com.example.demo.model.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toEntity(UserDto e);

    UserDto toDto(User e);

    List<UserDto> toDtoList(List<User> e);
}
