package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	
	@Autowired
    TaskRepository repo;
	
	@GetMapping("/tasks")
	public List<Task> get(){
		return repo.findAll();
	}
	
	@PostMapping("/task")
	public Task add(@RequestBody Task t) {
		repo.save(t);
		
		return t;
	}
	
	@PutMapping("/task/{id}")
	public Task update(@PathVariable int id,
			           @RequestBody Task t) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return repo.save(t);
		}
		
		return repo.save(t);
	}
	
	@DeleteMapping("/deleteTask/{id}")
	public void delete(@PathVariable int id)throws Exception{
		if(repo.existsById(id)) {
			repo.deleteById(id);
		}else {
			throw new Exception("the data is null");
		}
	}
}

