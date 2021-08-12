package com.hdregistros.hr_pets.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdregistros.hr_pets.entities.Pet;
import com.hdregistros.hr_pets.repositories.PetRepository;

@RestController // Web Service
@RequestMapping(value = "/pets") //Caminho padrão do recurso
public class PetResources {
	
	
	@Autowired // Injeção de Dependêcnia
	private PetRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Pet>> findAll() {
		List<Pet> list = repository.findAll();
		return ResponseEntity.ok(list);			
	}
	
	@GetMapping(path= "/{id}")
	public ResponseEntity<Pet> findById(@PathVariable Long id) {
		Pet pet = repository.findById(id).get();
		return ResponseEntity.ok(pet);
	}
	
	@DeleteMapping(path= "/{id}")
	public ResponseEntity<List<Pet>> deleteById(@PathVariable Long id) throws Exception {
		repository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK); 
	}
	
	@PostMapping
	public ResponseEntity<Pet> save(@RequestBody Pet pet){
		repository.save(pet);
		return new ResponseEntity<Pet>(pet, HttpStatus.OK);
	}
	
	@PutMapping(value="/{id}")
	public Optional<Object> update(@PathVariable Long id, @RequestBody Pet newPet){
		return repository.findById(id)
				.map(pet -> {
					pet.setNome(newPet.getNome());
					pet.setRaca(newPet.getRaca());
					pet.setProprietario(newPet.getProprietario());
					Pet updPet = repository.save(pet);
					return ResponseEntity.ok().body(updPet);
				});	
		
	}
	


}
