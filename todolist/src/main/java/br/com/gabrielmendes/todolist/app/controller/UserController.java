package br.com.gabrielmendes.todolist.app.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gabrielmendes.todolist.app.dto.request.SaveUserRequest;
import br.com.gabrielmendes.todolist.app.dto.response.UserResponse;
import br.com.gabrielmendes.todolist.app.service.IUserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {

    private final IUserService userService;

    @PostMapping
    public ResponseEntity<UserResponse> saveUser(@RequestBody @Valid SaveUserRequest request) {
        
        UserResponse response = userService.saveUser(request);

        return ResponseEntity.created(URI.create("/user/" + response.id())).body(response);

    }

}
