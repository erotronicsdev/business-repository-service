package net.erotronics.business.service;

import net.erotronics.business.persistence.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusinessService {

    @Autowired
    BusinessRepository businessRepository;

    public List getAllBusinesses() {
        List businesses = new ArrayList<>();
        businessRepository.findAll().forEach(businesses::add);
        return businesses;
    }
}
