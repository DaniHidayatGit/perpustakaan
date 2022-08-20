package com.example.demo.model.dto;

import com.example.demo.model.Anggota;
import com.example.demo.model.Petugas;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PeminjamanDto {
    private Integer id;
    private String tgl_pinjam;
    private String tgl_kembali;
    private Anggota anggota;
    private Petugas petugas;
}
