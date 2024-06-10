package br.com.gabrielmendes.todolist.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabrielmendes.todolist.infra.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {}