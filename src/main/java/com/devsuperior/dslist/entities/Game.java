package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//essa notation tem o objetivo de configurar a classe java para ela ser equivalente a uma tabela do banco
@Entity
@Table(name = "tb_game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public Game(Long id, String title,
    Integer year, String genre, String platform, String imgUrl,
    String shortDescription, String longDescription){

        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platform = platform;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public String getGenre() {
        return genre;
    }
    public Long getId() {
        return id;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public String getLongDescription() {
        return longDescription;
    }
    public String getPlatform() {
        return platform;
    }
    public String getShortDescription() {
        return shortDescription;
    }
    public String getTitle() {
        return title;
    }
    public Integer getYear() {
        return year;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Game other = (Game) obj;
        return Objects.equals(id, other.id);
    }
}
