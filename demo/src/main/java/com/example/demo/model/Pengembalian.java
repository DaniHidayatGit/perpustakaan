package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Pengembalian extends Base{

    private String tgl_pengembalian;

    private Double denda;

    @OneToOne
    private Peminjaman peminjaman;

    @ManyToOne
    private Anggota anggota;

    @ManyToOne
    private Petugas petugas;

    @ManyToMany
    @JoinTable(name = "pengembalian_detail")
    private List<Buku> buku;
}
