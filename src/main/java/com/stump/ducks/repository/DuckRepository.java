package com.stump.ducks.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.stump.ducks.entity.Duck;

@RepositoryRestResource(collectionResourceRel = "ducks", path = "ducks" )
public interface DuckRepository extends PagingAndSortingRepository<Duck, Integer> {
	
	List<Duck> findByName(@Param("name") String name);
}
