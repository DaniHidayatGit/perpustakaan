package com.example.demo.controller;

import com.example.demo.common.Response;
import com.example.demo.model.dto.AnggotaDto;
import com.example.demo.model.dto.UserDto;
import com.example.demo.service.AnggotaService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService service;

    @GetMapping
    public Response findAll(){
        return new Response(
                service.findAll(),
                service.findAll().size(),
                HttpStatus.OK
        );
    }

    @GetMapping("/{id}")
    public Response findById(@PathVariable Integer id){
        return new Response(
                service.findById(id),
                "Berhasil mendapatkan data",
                HttpStatus.OK
        );
    }

    @PostMapping
    public Response create(@RequestBody UserDto param){
        return new Response(
                service.create(param),
                "Berhasil create",
                HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public Response delete(@PathVariable Integer id){
        if(service.delete(id)){
            return new Response("Berhasil didelete", HttpStatus.OK);
        }return new Response("Gagal didelete", HttpStatus.OK);
    }
}
