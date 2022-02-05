package com.stump.ducks.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.stump.ducks.entity.Duck;

@RepositoryRestResource(collectionResourceRel = "ducks", path = "ducks" )
public interface DuckRepository extends JpaRepository<Duck, Long> {
	
	List<Duck> findByName(@Param("name") String name);

//	Optional<Duck> findById(Long l);
	
	Duck getById(Long l);
	
	
}
