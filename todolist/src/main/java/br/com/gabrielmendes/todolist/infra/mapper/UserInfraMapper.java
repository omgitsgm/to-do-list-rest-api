package br.com.gabrielmendes.todolist.infra.mapper;

import org.mapstruct.Mapper;

import br.com.gabrielmendes.todolist.domain.model.UserModel;
import br.com.gabrielmendes.todolist.infra.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserInfraMapper {

    UserModel toUserModel(UserEntity userEntity);

    UserEntity toUserEntity(UserModel userModel);
    
}
