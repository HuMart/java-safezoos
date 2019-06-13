package com.lambdaschool.safezoos.repository;

import com.lambdaschool.safezoos.model.Animal;
import com.lambdaschool.safezoos.view.CountAnimalInZoo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
    Animal findByAnimaltype(String type);

    @Query(value = "SELECT a.animalid, a.animaltype, count(z.zooid) as countzoos FROM zooanimals z INNER JOIN animal a ON z.animalid=a.animalid GROUP BY a.animalid, a.animaltype ORDER BY a.animaltype, a.animalid",
           nativeQuery = true)
    ArrayList<CountAnimalInZoo> getCountAnimalInZoo();
}
