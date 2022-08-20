package com.example.demo.model.dto;

import com.example.demo.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetugasDto {
    private Integer id;

    private String nama;

    private String telp;

    private String alamat;

    private User user;
}

