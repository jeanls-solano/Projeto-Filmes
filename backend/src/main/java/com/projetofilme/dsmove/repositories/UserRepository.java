package com.projetofilme.dsmove.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetofilme.dsmove.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
