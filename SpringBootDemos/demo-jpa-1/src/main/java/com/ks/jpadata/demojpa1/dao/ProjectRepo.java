package com.ks.jpadata.demojpa1.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ks.jpadata.demojpa1.model.Project;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Integer> {
	
	public Project save(Project project);
	public Optional<Project> findById(Integer id);
	public List<Project> findAll();
	public void deleteById(Integer id);
	public boolean existsById(Integer id);
	
}
