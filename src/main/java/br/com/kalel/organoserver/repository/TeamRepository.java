package br.com.kalel.organoserver.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.kalel.organoserver.models.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {
    
}
