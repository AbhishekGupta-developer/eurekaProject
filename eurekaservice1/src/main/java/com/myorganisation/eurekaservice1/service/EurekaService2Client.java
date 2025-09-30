package com.myorganisation.eurekaservice1.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eurekaservice2")
public interface EurekaService2Client {

    @GetMapping("/hello")
    public String sayHello();

    @GetMapping("/api/health")
    public ResponseEntity<String> serverStatus();
}
