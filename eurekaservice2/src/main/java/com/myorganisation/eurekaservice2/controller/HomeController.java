package com.myorganisation.eurekaservice2.controller;

import com.myorganisation.eurekaservice2.service.EurekaService1Client;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    private EurekaService1Client eurekaService1Client;

    public HomeController(EurekaService1Client eurekaService1Client) {
        this.eurekaService1Client = eurekaService1Client;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> homeApi() {
        return new ResponseEntity<>("Hi from eurekaservice2", HttpStatusCode.valueOf(200));
    }

    @GetMapping("/api/health")
    public ResponseEntity<String> serverHealth() {
        return new ResponseEntity<>("Service2 is live", HttpStatusCode.valueOf(200));
    }

    @GetMapping("/serverStatusOfService1")
    public ResponseEntity<String> randomApi() {
        return eurekaService1Client.serverStatusOfService1();
    }
}
