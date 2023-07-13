package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.DTO.GameListDTO;
import com.devsuperior.dslist.entitities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;

@Service
public class GameListService {

    // Injeção de dependência - O Spring vai injetar a dependência do GameRepository
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }


}
