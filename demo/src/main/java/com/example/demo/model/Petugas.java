package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Petugas extends Base{

    private String nama;

    private String telp;

    private String alamat;

    @JsonIgnore
    @OneToMany(mappedBy = "petugas")
    private List<Peminjaman> peminjaman;

    @ManyToOne
    private User user;
}
