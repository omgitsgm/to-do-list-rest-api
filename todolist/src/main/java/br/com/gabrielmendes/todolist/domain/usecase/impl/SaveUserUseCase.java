package br.com.gabrielmendes.todolist.domain.usecase.impl;

import org.springframework.stereotype.Component;

import br.com.gabrielmendes.todolist.domain.gateway.UserGateway;
import br.com.gabrielmendes.todolist.domain.model.UserModel;
import br.com.gabrielmendes.todolist.domain.usecase.ISaveUserUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class SaveUserUseCase implements ISaveUserUseCase {

    private final UserGateway userGateway;

    @Override
    public UserModel execute(UserModel userModel) {
        
        return userGateway.save(userModel);

    }
    
}
