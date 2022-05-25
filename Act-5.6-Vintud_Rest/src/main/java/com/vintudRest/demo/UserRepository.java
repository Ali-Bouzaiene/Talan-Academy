package com.vintudRest.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<UserImpl, Long> {	
	
	
	@Query(value = "SELECT * FROM users  WHERE pseudo = :pseudo", nativeQuery = true)
	public List<UserImpl> findbypseudo(@Param("pseudo") String pseudo);
}
