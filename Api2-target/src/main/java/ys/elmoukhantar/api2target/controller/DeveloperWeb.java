package ys.elmoukhantar.api2target.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ys.elmoukhantar.api2target.Model.Developer;
import ys.elmoukhantar.api2target.service.CallApi1;

@RestController
@RequestMapping("/callinapi1")
public class DeveloperWeb {

    private CallApi1 callApi1;

    @GetMapping("/developer/{name}")
    public Developer getdeveloper(@PathVariable String name) {

        Developer dv= callApi1.getDeveloper(name);

        return dv;
    }
}
