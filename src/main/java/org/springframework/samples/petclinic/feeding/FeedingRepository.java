package org.springframework.samples.petclinic.feeding;

import java.util.List;
import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.samples.petclinic.pet.Pet;

public interface FeedingRepository extends CrudRepository<Feeding, Integer> {
    
	 @Query("SELECT t FROM FeedingType t")
	 List<FeedingType> findAllFeedingTypes();
	
	 @Query("SELECT t FROM FeedingType t WHERE t.name=?1")
	 FeedingType findFeedingType(String nombre);
	
	List<Feeding> findAll();
    
    Optional<Feeding> findById(int id);

    Feeding save(Feeding p);
}
