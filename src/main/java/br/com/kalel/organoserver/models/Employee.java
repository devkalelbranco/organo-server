package br.com.kalel.organoserver.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SecondaryTable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Employee {
    private @Id @GeneratedValue(strategy = GenerationType.AUTO) UUID id;
    String name;
    String position;

    @Column(name = "imageURL", length = 999999)
    String imageURL;

    @ManyToOne(optional = false)
    @JoinColumn(name = "team_id", nullable = false, referencedColumnName = "id")
    Team team;

    public Employee(String name, String position, String imageURL, Team team) {
        this.name = name;
        this.position = position;
        this.imageURL = imageURL;
        this.team = team;
    }

    public Employee(UUID id){
        this.id = id;
    }
    public Employee(){}


}
