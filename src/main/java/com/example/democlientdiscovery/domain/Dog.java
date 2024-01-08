package com.example.democlientdiscovery.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "dogs")
public final class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String name;

    private String breed;

    private String weight;

    public Dog() {
    }

    public Dog(Integer id, String name, String breed, String weight) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
