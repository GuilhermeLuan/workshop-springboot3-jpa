package com.example.course.resources;

import com.example.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")//Recurso web controlado por um controllador web.
public class UserResource {

    //endpoit para acessar os usuarios.
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Guilherme Luan", "guilhermeluan@gmail.com", "9999999", "pswd");
        return ResponseEntity.ok().body(u);
    }
}
