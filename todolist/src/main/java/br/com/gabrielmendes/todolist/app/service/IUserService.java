package br.com.gabrielmendes.todolist.app.service;

import br.com.gabrielmendes.todolist.app.dto.request.SaveUserRequest;
import br.com.gabrielmendes.todolist.app.dto.response.UserResponse;

public interface IUserService {
    
    public UserResponse saveUser(SaveUserRequest saveUserRequest);

}
