package br.com.kalel.organoserver.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Employee {
    private @Id @GeneratedValue(strategy = GenerationType.AUTO) UUID id;
    String name;
    String position;
    String imageURL;

    @ManyToOne
    Team team;

    public Employee(String name, String position, String imageURL, Team team) {
        this.name = name;
        this.position = position;
        this.imageURL = imageURL;
        
    }

    public Employee(){}

}
