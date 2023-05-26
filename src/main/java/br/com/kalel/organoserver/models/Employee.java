package br.com.kalel.organoserver.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    String name;
    String position;
    String imageURL;
    Team team;


    public Employee(String name, String position, String imageURL, Team team) {
        this.name = name;
        this.position = position;
        this.imageURL = imageURL;
        this.team = team;
    }

}
