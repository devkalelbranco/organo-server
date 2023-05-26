package br.com.kalel.organoserver.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Team {
    private @Id @GeneratedValue(strategy = GenerationType.AUTO) UUID id;
    String name;
    String primaryColor;
    String secondaryColor;

    public Team(String name, String primaryColor, String secondaryColor){
        this.name = name;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
    }

    public Team(){
        
    }
}
