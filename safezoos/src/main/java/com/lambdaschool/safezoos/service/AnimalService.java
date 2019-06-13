package com.lambdaschool.safezoos.service;

import com.lambdaschool.safezoos.model.Animal;
import com.lambdaschool.safezoos.view.CountAnimalInZoo;

import java.util.ArrayList;

public interface AnimalService
{
    ArrayList<Animal> findAll();

    Animal findAnimalByType(String type);

    ArrayList<CountAnimalInZoo> getCountAnimalInZoo();
}
