package com.projetofilme.dsmove.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetofilme.dsmove.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
