package br.com.gabrielmendes.todolist.infra.dataprovider;

import org.springframework.stereotype.Component;

import br.com.gabrielmendes.todolist.domain.gateway.UserGateway;
import br.com.gabrielmendes.todolist.domain.model.UserModel;
import br.com.gabrielmendes.todolist.infra.entity.UserEntity;
import br.com.gabrielmendes.todolist.infra.mapper.UserInfraMapper;
import br.com.gabrielmendes.todolist.infra.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class UserDataProvider implements UserGateway{

    private final UserRepository userRepository;
    private final UserInfraMapper userInfraMapper;

    @Override
    public UserModel save(UserModel userModel) {
        
        UserEntity userEntity = userInfraMapper.toUserEntity(userModel);

        UserEntity savedEntity = userRepository.save(userEntity);

        return userInfraMapper.toUserModel(savedEntity);

    }
    
}
