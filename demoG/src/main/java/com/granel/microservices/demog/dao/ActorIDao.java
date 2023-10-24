package com.granel.microservices.demog.dao;

import com.granel.microservices.demog.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorIDao extends JpaRepository<Actor, Integer> {
}
