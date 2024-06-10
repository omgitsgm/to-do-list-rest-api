package br.com.gabrielmendes.todolist.app.service.impl;

import org.springframework.stereotype.Service;

import br.com.gabrielmendes.todolist.app.dto.request.SaveUserRequest;
import br.com.gabrielmendes.todolist.app.dto.response.UserResponse;
import br.com.gabrielmendes.todolist.app.mapper.UserAppMapper;
import br.com.gabrielmendes.todolist.app.service.IUserService;
import br.com.gabrielmendes.todolist.domain.model.UserModel;
import br.com.gabrielmendes.todolist.domain.usecase.ISaveUserUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService implements IUserService {

    private final UserAppMapper userMapper;
    private final ISaveUserUseCase saveUserUseCase;

    @Override
    public UserResponse saveUser(SaveUserRequest saveUserRequest) {
        
        UserModel userModel = userMapper.toUserModel(saveUserRequest);

        UserModel savedUserModel = saveUserUseCase.execute(userModel);

        UserResponse userResponse = userMapper.toUserResponse(savedUserModel);

        return userResponse;
        
    }
    
}
