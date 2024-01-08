package com.example.democlientdiscovery.web;

import com.example.democlientdiscovery.domain.Dog;
import com.example.democlientdiscovery.service.DogService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DogController {

    private final DogService dogService;
    private static final Logger log = LoggerFactory.getLogger(DogController.class);

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @PostMapping("/dogs")
    @ResponseStatus(HttpStatus.OK)
    public Dog createDog(@RequestBody Dog dog) {
        log.info("createDog() - start: dog = {}", dog.toString());
        var response = dogService.createDog(dog);
        log.info("createDog() - stop: dog id = {}", response.getId());
        return response;
    }

    @GetMapping("/dogs/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Dog getDogById(@PathVariable Integer id) {

        return dogService.getById(id);
    }

    @GetMapping("/dogs")
    @ResponseStatus(HttpStatus.OK)
    public List<Dog> getAllDogs() {
        return dogService.getAll();
    }

    @PatchMapping("/dogs/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Dog updateDogById(@PathVariable Integer id, @RequestBody Dog dog) {
        return dogService.updateById(id, dog);
    }

    @DeleteMapping("/dogs/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteDogById(@PathVariable Integer id){
        dogService.deleteById(id);
    }

}
