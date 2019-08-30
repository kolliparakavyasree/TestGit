package com.ks.jpadata.demojpa1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ks.jpadata.demojpa1.dao.ProjectRepo;
import com.ks.jpadata.demojpa1.model.Project;

@RestController
@RequestMapping("/projectsapp")
public class WebController {
	
	@Autowired
	ProjectRepo repo;

	@GetMapping("/test")
	public String test() {
		return "hello world";
	}
	
	@PostMapping("/projects")
	public Project createProject(@RequestBody Project project) {
		return repo.save(project);
	}
	
	@GetMapping("/projects/{id}")
	public Optional<Project> findById(@PathVariable Integer id){
		return repo.findById(id);
	}
	
	@GetMapping("/All")
	public List<Project> findAll(){
		return repo.findAll();
	}
	
	@PutMapping("/projects")
	public Project updateProject(@RequestBody Project project) {
		Optional<Project> toUpdate = repo.findById(project.getId());
		Project project1 = toUpdate.get();
		
	}
	
	public WebController() {
		// TODO Auto-generated constructor stub
	}

}
