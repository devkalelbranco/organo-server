package br.com.kalel.organoserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.kalel.organoserver.models.Employee;
import br.com.kalel.organoserver.models.Team;
import br.com.kalel.organoserver.repository.EmployeeRepository;
import br.com.kalel.organoserver.repository.TeamRepository;

@Configuration
public class LoadDatabase {
    
    @Bean
    public CommandLineRunner load(TeamRepository teamRepository, EmployeeRepository employeeRepository){
        return (args) -> {
            Team team = teamRepository.save(new Team("Tecnologia", "#57C278", "#D9F7E9"));
            teamRepository.save(new Team("Unificada", "#82CFFA", "#E8F8FF"));
            teamRepository.save(new Team("Contas", "#A6D157", "#F0F8E2"));
            teamRepository.save(new Team("Atendimentos", "#E06B69", "#FDE7E8"));

            employeeRepository.save(new Employee("Kalel Chaves", "Arquiteto de Software", "https://media.licdn.com/dms/image/D4D03AQHbphypT88IGQ/profile-displayphoto-shrink_100_100/0/1672757087765?e=1691020800&v=beta&t=jxBlc342PFGUG75CRmaSVZpNvaBL8UcvAykGmKmQjPc", team));
            employeeRepository.save(new Employee("Jeferson Dal Molin", "Arquiteto de Software", "https://media.licdn.com/dms/image/D4D03AQHbphypT88IGQ/profile-displayphoto-shrink_100_100/0/1672757087765?e=1691020800&v=beta&t=jxBlc342PFGUG75CRmaSVZpNvaBL8UcvAykGmKmQjPc", team));
            employeeRepository.save(new Employee("Rafael Bonatto", "Tech Lead", "https://media.licdn.com/dms/image/D4D03AQHbphypT88IGQ/profile-displayphoto-shrink_100_100/0/1672757087765?e=1691020800&v=beta&t=jxBlc342PFGUG75CRmaSVZpNvaBL8UcvAykGmKmQjPc", team));

        };
    }

}
