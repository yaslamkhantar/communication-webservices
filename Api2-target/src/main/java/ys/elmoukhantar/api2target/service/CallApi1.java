package ys.elmoukhantar.api2target.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import ys.elmoukhantar.api2target.Model.Developer;
import ys.elmoukhantar.api2target.config.CallServiceApi1;

@Service

public class CallApi1 {
    private CallServiceApi1 callServiceApi1;
    private WebClient webClient;

    public CallApi1(CallServiceApi1 callServiceApi1, WebClient webClient) {

        this.callServiceApi1 = callServiceApi1;
        this.webClient = WebClient.create(callServiceApi1.getBaseurl());
    }


    public Developer getDeveloper(String name) {
        Developer dve=
                webClient.get().uri("/developer/{name}",name)
                        .retrieve().bodyToMono(Developer.class).block();

        return dve;

    }
}
