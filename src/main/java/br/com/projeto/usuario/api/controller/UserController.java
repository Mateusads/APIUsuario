package br.com.projeto.usuario.api.controller;

import br.com.projeto.usuario.api.controller.dto.UserRequestDTO;
import br.com.projeto.usuario.api.entities.User;
import br.com.projeto.usuario.api.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("/user")
    public void listAllUser(){

    }

    @GetMapping("/user/{name}")
    public void findUserByName(){

    }

    @PostMapping("/user")
    public User createUser(@RequestBody UserRequestDTO userRequestDTO){
        var entity = userService.createUser(user);
        return entity;
    }

}
