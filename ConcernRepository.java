package it.ousssein.concern.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import it.ousssein.concern.entity.Concern;

public interface ConcernRepository extends JpaRepository<Concern, Long> {
	
	public List<Concern>findAll();
	public Concern findById(int id);
	public  Concern save(Concern concern);

}
