package net.erotronics.business.controller;

import net.erotronics.business.service.BusinessService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/business-repository-service")
public class BusinessRepoController {

    private BusinessService businessService;

    @RequestMapping(
            value = "/list-businesses",
            headers = { "church=globe", "town=reading" }, consumes = MediaType.ALL_VALUE, method =  RequestMethod.GET)
    public List listAllBusiness() {
        return businessService.getAllBusinesses();
    }
}
