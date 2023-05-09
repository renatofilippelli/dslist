package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entity.Game;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;
@Data
public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String platforms;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game e){
        this.id     = e.getId();
        this.title  = e.getTitle();
        this.year   = e.getYear();
        this.imgUrl = e.getImgUrl();
        this.shortDescription = e.getShortDescription();
    }
}
