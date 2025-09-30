package com.myorganisation.eurekaservice1.controller;

import com.myorganisation.eurekaservice1.service.EurekaService2Client;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CallController {

    private EurekaService2Client eurekaService2Client;

    public CallController(EurekaService2Client eurekaService2Client) {
        this.eurekaService2Client = eurekaService2Client;
    }

    @GetMapping("/call-service2")
    public String callService2() {
        return eurekaService2Client.sayHello();
    }

    @GetMapping("/check-service2-health")
    public ResponseEntity<String> random() {
        return eurekaService2Client.serverStatus();
    }

    @GetMapping("/health")
    public ResponseEntity<String> checkHealth() {
        return new ResponseEntity<>("Service1 is live", HttpStatusCode.valueOf(200));
    }
}
