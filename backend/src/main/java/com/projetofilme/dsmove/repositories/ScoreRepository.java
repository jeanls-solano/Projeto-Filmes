package com.projetofilme.dsmove.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetofilme.dsmove.entities.Score;
import com.projetofilme.dsmove.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
