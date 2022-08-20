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
public class User extends Base{

    private String username;

    private String password;

    private String email;

    private String role;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Anggota> anggota;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Petugas> petugas;
}
