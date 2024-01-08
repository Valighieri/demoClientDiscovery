package com.example.democlientdiscovery.service;

import com.example.democlientdiscovery.domain.Dog;
import com.example.democlientdiscovery.repository.DogRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceBean implements DogService {

    private final DogRepository dogRepository;

    public DogServiceBean(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public Dog createDog(Dog dog) {
        return dogRepository.save(dog);
    }

    @Override
    public Dog getById(Integer id) {
        return dogRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException
                        ("Dog not found with id = " + id));
    }

    @Override
    public List<Dog> getAll() {
        return dogRepository.findAll();
    }

    @Override
    public Dog updateById(Integer id, Dog dog) {
        return dogRepository.findById(id)
                .map(entity -> {
                    entity.setName(dog.getName());
                    entity.setBreed(dog.getBreed());
                    entity.setWeight(dog.getWeight());
                    return dogRepository.save(entity);
                })
                .orElseThrow(() -> new EntityNotFoundException
                ("Dog not found with id = " + id));
    }

    @Override
    public void deleteById(Integer id) {
         dogRepository.deleteById(id);
    }


}












