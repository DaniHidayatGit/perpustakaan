package com.example.demo.model.dto;

import com.example.demo.model.Anggota;
import com.example.demo.model.Peminjaman;
import com.example.demo.model.Petugas;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PengembalianDto {
    private Integer id;
    private String tgl_pengembalian;

    private Double denda;

    private Peminjaman peminjaman;

    private Anggota anggota;

    private Petugas petugas;
}
