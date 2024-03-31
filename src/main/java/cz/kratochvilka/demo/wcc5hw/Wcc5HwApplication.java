package cz.kratochvilka.demo.wcc5hw;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Wcc5HwApplication {

    private final User son;
    private final User mother;
    private final User father;

    public Wcc5HwApplication(User son, User mother, User father) {
        this.son = son;
        this.mother = mother;
        this.father = father;
    }

    public static void main(String[] args) {
        SpringApplication.run(Wcc5HwApplication.class, args);
    }

    @PostConstruct
    public void printFamily() {
        System.out.println("Son: " + son);
        System.out.println("Mother: " + mother);
        System.out.println("Father: " + father);
    }
}
