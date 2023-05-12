package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDto {

    private Long id;
    private String name;
    
    
    public GameListDto(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }


    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    

}