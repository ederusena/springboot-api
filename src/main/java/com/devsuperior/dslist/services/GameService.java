package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.DTO.GameMinDTO;
import com.devsuperior.dslist.entitities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {

    // Injeção de dependência - O Spring vai injetar a dependência do GameRepository
    @Autowired
    private GameRepository gameRepository;

    // public List<GameMinDTO> findAllMin() {
    //     List<Game> result = gameRepository.findAll();
    //     return result;
    // }

    public List<Game> findAll() {
        List<Game> result = gameRepository.findAll();
        return result;
    }
}
