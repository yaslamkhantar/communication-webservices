package ys.elmoukhantar.api1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ys.elmoukhantar.api1.dto.Developerrepo;
import ys.elmoukhantar.api1.dto.ManagerRepo;
import ys.elmoukhantar.api1.entity.Developer;
import ys.elmoukhantar.api1.entity.Manager;

@SpringBootApplication
public class Api1Application {

    public static void main(String[] args) {
        SpringApplication.run(Api1Application.class, args);
    }

@Bean
   CommandLineRunner start(Developerrepo developerrepo){
        return args -> {

            developerrepo.save(new Developer("raf","yassine","abidar","JAVA|ANGULAR"));
            developerrepo.save(new Developer("rafq","omar","azami","JAVA|REACT"));
            developerrepo.save(new Developer("gaf","MIKO","YOUSSEF",".NET|PHP"));
            developerrepo.save(new Developer("ragf","Abdellatif","marjani","NODEJS|DJANGO"));
        };
   }




}
