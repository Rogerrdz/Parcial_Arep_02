package org.example.controller;

import org.example.service.HttpService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProxyController {

    private final HttpService httpService = new HttpService();

    private String service1 = System.getenv("SERVICE1_URL");
    private String service2 = System.getenv("SERVICE2_URL");

    @GetMapping("/tribseq")
    public String tribseq(@RequestParam String value) {

        String url1 = service1 + "/math/tribseq?value=" + value;
        String url2 = service2 + "/math/tribseq?value=" + value;

        try {
            return httpService.get(url1);
        } catch (Exception e) {
            return httpService.get(url2);
        }
    }
}