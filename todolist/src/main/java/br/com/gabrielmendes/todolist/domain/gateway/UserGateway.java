package br.com.gabrielmendes.todolist.domain.gateway;

import br.com.gabrielmendes.todolist.domain.model.UserModel;

public interface UserGateway {
    
    public UserModel save(UserModel userModel);

}
