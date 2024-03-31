package cz.kratochvilka.demo.wcc5hw;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public User son(@Value("${son.firstName}") String firstName, @Value("${son.lastName}") String lastName) {
        User son = new User();
        son.setFirstName(firstName);
        son.setLastName(lastName);
        return son;
    }

    @Bean
    public User mother(@Value("${mother.firstName}") String firstName, @Value("${mother.lastName}") String lastName) {
        User mother = new User();
        mother.setFirstName(firstName);
        mother.setLastName(lastName);
        return mother;
    }

    @Bean
    public User father(@Value("${father.firstName}") String firstName, @Value("${father.lastName}") String lastName) {
        User father = new User();
        father.setFirstName(firstName);
        father.setLastName(lastName);
        return father;
    }
}
