package br.com.projeto.usuario.api.controller;

import br.com.projeto.usuario.api.controller.dto.UserRequestDTO;
import br.com.projeto.usuario.api.controller.dto.UserResponseDTO;
import br.com.projeto.usuario.api.controller.mapper.UserMapper;
import br.com.projeto.usuario.api.entities.User;
import br.com.projeto.usuario.api.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public UserResponseDTO createUser(@RequestBody UserRequestDTO userRequestDTO){
        var entity = UserMapper.toEntity(userRequestDTO);
        var result = userService.createUser(entity);
        return UserMapper.toDTO(result);
    }

    @GetMapping("/user")
    public List<UserResponseDTO> listAllUser(){
        var result = userService.findAll();
        return UserMapper.toDTOs(result);
    }

    @GetMapping("/user/name/{name}")
    public List<UserResponseDTO> findUserByName(@RequestParam String nameRequest){
        var result = userService.findByName(nameRequest);
        return UserMapper.toDTOs(result);
    }

    @GetMapping("/user/email/{email}")
    public UserResponseDTO findUserByEmail(@RequestParam String emailRequest){
        var result = userService.findByEmail(emailRequest);
        return UserMapper.toDTO(result);
    }

    @PatchMapping("/user/age")
    public UserResponseDTO updateUser(@RequestBody UserRequestDTO userRequestDTO){
        var entity = UserMapper.toEntity(userRequestDTO);
        var result = userService.updateUser(entity);
        return UserMapper.toDTO(result);
    }

    @DeleteMapping("/user/delete/{email}")
    public void deleteUserByEmail(@RequestParam String emailRequest){
        userService.deleteUser(emailRequest);

    }
}
