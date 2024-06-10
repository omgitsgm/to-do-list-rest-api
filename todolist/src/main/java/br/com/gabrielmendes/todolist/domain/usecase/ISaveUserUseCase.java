package br.com.gabrielmendes.todolist.domain.usecase;

import br.com.gabrielmendes.todolist.domain.model.UserModel;

public interface ISaveUserUseCase {

    public UserModel execute(UserModel userModel);

}