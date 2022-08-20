package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Getter
@Setter
@Entity
public class Buku extends Base{

    private String judul;

    private String tahun_terbit;

    private Integer jumlah;

    private String isbn;

    @JsonIgnore
    @ManyToMany(mappedBy = "buku")
    private List<Peminjaman> peminjaman;

    @JsonIgnore
    @ManyToMany(mappedBy = "buku")
    private List<Pengembalian> pengembalian;

    @ManyToOne
    private Pengarang pengarang;

    @ManyToOne
    private Penerbit penerbit;
}
