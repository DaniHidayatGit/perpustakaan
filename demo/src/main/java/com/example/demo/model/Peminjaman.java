package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Peminjaman extends Base{

    private String tgl_pinjam;

    private String tgl_kembali;

    @ManyToOne
    private Anggota anggota;

    @ManyToOne
    private Petugas petugas;

    @ManyToMany
    @JoinTable(name = "peminjaman_detail")
    private List<Buku> buku;

    @JsonIgnore
    @OneToOne(mappedBy = "peminjaman")
    private Pengembalian pengembalian;

}
