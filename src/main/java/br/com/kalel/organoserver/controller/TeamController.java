package br.com.kalel.organoserver.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kalel.organoserver.models.Team;
import br.com.kalel.organoserver.repository.TeamRepository;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private final TeamRepository repository;
    
    public TeamController(TeamRepository repository) {
        this.repository = repository;
    }


    @GetMapping("")
    public Iterable<Team> teams(){
        return repository.findAll();
    }

    @PostMapping("") 
    public Team newTeam(@RequestBody Team team){
        return this.repository.save(team);
    }

}
