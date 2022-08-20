package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.model.dto.UserDto;
import com.example.demo.model.mapper.UserMapper;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public List<UserDto> findAll(){
        return UserMapper.INSTANCE.toDtoList(repository.findAll());
    }

    public UserDto findById(Integer id){
        return UserMapper.INSTANCE.toDto(
                repository.findById(id).orElseThrow(null)
        );
    }

    public UserDto create(UserDto param){
        return UserMapper.INSTANCE.toDto(
                repository.save(
                        UserMapper.INSTANCE.toEntity(param)
                )
        );
    }

    public boolean delete(Integer id){
        try{
            User data = repository.findById(id).orElseThrow(null);
            repository.delete(data);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
