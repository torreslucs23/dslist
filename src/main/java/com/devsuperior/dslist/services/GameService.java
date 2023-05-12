package com.devsuperior.dslist.services;

import org.hibernate.sql.results.spi.ResultsConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;

import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
    var result = gameRepository.findAll();
    List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList(); 
    return dto;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result  =gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }
}
