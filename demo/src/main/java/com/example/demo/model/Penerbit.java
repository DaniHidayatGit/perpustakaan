package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Penerbit extends Base{
    private String nama;

    private String alamat;

    private String telp;

    @JsonIgnore
    @OneToMany(mappedBy = "penerbit")
    private List<Buku> buku;
}
