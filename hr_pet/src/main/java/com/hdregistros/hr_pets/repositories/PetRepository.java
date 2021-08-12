package com.hdregistros.hr_pets.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hdregistros.hr_pets.entities.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{

}
