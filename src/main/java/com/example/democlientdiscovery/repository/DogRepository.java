package com.example.democlientdiscovery.repository;

import com.example.democlientdiscovery.domain.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends JpaRepository<Dog, Integer> {}
