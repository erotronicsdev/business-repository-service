package net.erotronics.business.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business-repository-service")
public class BusinessRepoController {

    @RequestMapping(
            value = "/list-businesses",
            headers = { "church=globe", "town=reading" }, consumes = MediaType.ALL_VALUE, method =  RequestMethod.GET)
    public String listAllBusiness(HttpEntity<String> httpEntity) {
        String test = httpEntity.getBody();
        return test;
    }
}
