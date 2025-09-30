package com.myorganisation.eurekaservice2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eurekaservice1")
public interface EurekaService1Client {

    @GetMapping("/health")
    public ResponseEntity<String> serverStatusOfService1();
}