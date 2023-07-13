package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.DTO.GameDTO;
import com.devsuperior.dslist.DTO.GameMinDTO;
import com.devsuperior.dslist.entitities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {

    // Injeção de dependência - O Spring vai injetar a dependência do GameRepository
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        // if the id does not exist, the findById method will return null
        // the get() method will throw an exception if the id does not exist
        Game entityResult = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(entityResult);    
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAllMin() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public List<Game> findAll() {
        List<Game> result = gameRepository.findAll();
        return result;
    }


}
