package br.com.gabrielmendes.todolist.app.mapper;

import org.mapstruct.Mapper;

import br.com.gabrielmendes.todolist.app.dto.request.SaveUserRequest;
import br.com.gabrielmendes.todolist.app.dto.response.UserResponse;
import br.com.gabrielmendes.todolist.domain.model.UserModel;

@Mapper(componentModel = "spring")
public interface UserAppMapper {

    UserModel toUserModel(SaveUserRequest saveUserRequest);

    UserResponse toUserResponse(UserModel userModel);
    
}
