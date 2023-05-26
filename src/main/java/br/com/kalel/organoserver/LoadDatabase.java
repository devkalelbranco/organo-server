package br.com.kalel.organoserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.kalel.organoserver.models.Team;
import br.com.kalel.organoserver.repository.TeamRepository;

@Configuration
public class LoadDatabase {
    
    @Bean
    public CommandLineRunner load(TeamRepository teamRepository){
        return (args) -> {
            teamRepository.save(new Team("Tecnologia", "#57C278", "#D9F7E9"));
            teamRepository.save(new Team("Unificada", "#82CFFA", "#E8F8FF"));
            teamRepository.save(new Team("Contas", "#A6D157", "#F0F8E2"));
            teamRepository.save(new Team("Atendimentos", "#E06B69", "#FDE7E8"));
        };
    }

}
