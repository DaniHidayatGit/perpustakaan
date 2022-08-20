package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Anggota extends Base{

    private String nama;

    private String jenis_kelamin;

    private String alamat;

    private String telp;

    @ManyToOne
    private User user;

    @JsonIgnore
    @OneToMany(mappedBy = "anggota")
    private List<Peminjaman> peminjaman;

    @JsonIgnore
    @OneToMany(mappedBy = "anggota")
    private List<Pengembalian> pengembalian;
}
