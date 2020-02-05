package controllers;

import models.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.CityRepository;

import java.util.Set;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityRepository repository;

    @GetMapping(value = {"/",""})
    public Set<City> list(){return repository.findAll();}

}
