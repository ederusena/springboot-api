package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dslist.entitities.Game;

// Ao adicionar essa interface devemos extender a JpaRepository e passar o tipo da entidade e o tipo do id da entidade
public interface GameRepository extends JpaRepository<Game, Long> {
    
}
