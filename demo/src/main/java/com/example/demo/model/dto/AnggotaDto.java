package com.example.demo.model.dto;

import com.example.demo.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnggotaDto {
    private Integer id;
    private String nama;
    private String jenis_kelamin;
    private String alamat;
    private String telp;
    private User user;
}
