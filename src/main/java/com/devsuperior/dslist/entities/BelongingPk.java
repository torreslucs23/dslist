package com.devsuperior.dslist.entities;

import java.util.Objects;

import org.hibernate.mapping.Set;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPk {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gamelist;

    public BelongingPk(){

    }

    public BelongingPk(Game game, GameList gamelist){
        this.game = game;
        this.gamelist = gamelist;
    }
    public Game getGame() {
        return game;
    }
    public GameList getGamelist() {
        return gamelist;
    }
    public void setGame(Game game) {
        this.game = game;
    }
    public void setGamelist(GameList gamelist) {
        this.gamelist = gamelist;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(game, gamelist);
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
        BelongingPk other = (BelongingPk) obj;
        return Objects.equals(game, other.game) && Objects.equals(gamelist, other.gamelist);
    }
}
