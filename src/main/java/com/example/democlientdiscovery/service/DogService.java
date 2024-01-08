package com.example.democlientdiscovery.service;

import com.example.democlientdiscovery.domain.Dog;

import java.util.List;

public interface DogService {

    Dog createDog(Dog dog);

    Dog getById(Integer id);

    List<Dog> getAll();

    Dog updateById(Integer id, Dog dog);

    void deleteById(Integer id);
}
