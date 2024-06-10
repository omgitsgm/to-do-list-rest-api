package br.com.gabrielmendes.todolist.app.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record SaveUserRequest(

    @NotBlank
    @Size(max = 255)
    String name 
    
) {}
