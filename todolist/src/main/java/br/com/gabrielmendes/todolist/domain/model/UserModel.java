package br.com.gabrielmendes.todolist.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UserModel {

    private Long id;
    
    private String name;

}
