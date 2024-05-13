package ys.elmoukhantar.api1.web;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ys.elmoukhantar.api1.dto.Developerrepo;
import ys.elmoukhantar.api1.entity.Developer;

@RestController

@AllArgsConstructor
public class DeveloperW {

    private Developerrepo developerrepo;  // l'injection a travers l'annotation @AllArgsCostructor

    @GetMapping("/developer/{name}")
    public Developer getdeveloper(@PathVariable String name) {

        Developer dv= developerrepo.findByName(name);

        return dv;
    }


}
