package com.example.demo.model.dto;

import com.example.demo.model.Penerbit;
import com.example.demo.model.Pengarang;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BukuDto {
    private Integer id;
    private String judul;
    private String tahun_terbit;
    private Integer jumlah;
    private String isbn;
    private Pengarang pengarang;
    private Penerbit penerbit;
}
