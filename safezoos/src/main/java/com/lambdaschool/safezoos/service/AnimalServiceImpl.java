package com.lambdaschool.safezoos.service;

import com.lambdaschool.safezoos.model.Animal;
import com.lambdaschool.safezoos.repository.AnimalRepository;
import com.lambdaschool.safezoos.view.CountAnimalInZoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;

@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService
{
    @Autowired
    private AnimalRepository animalrepos;

    @Override
    public ArrayList<Animal> findAll()
    {
        ArrayList<Animal> list = new ArrayList<>();
        animalrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Animal findAnimalByType(String type) throws EntityNotFoundException
    {
        Animal animal = animalrepos.findByAnimaltype(type);

        if (animal == null)
        {
            throw new EntityNotFoundException("Animal " + type + " not found!");
        }
        return animal;
    }


    @Override
    public ArrayList<CountAnimalInZoo> getCountAnimalInZoo()
    {
        return animalrepos.getCountAnimalInZoo();
    }
}
