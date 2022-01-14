package org.springframework.samples.petclinic.feeding;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedingService {
	
	@Autowired 
	FeedingRepository feedingRepository;
	
    public List<Feeding> getAll(){
        List<Feeding> f=feedingRepository.findAll();
        return f;
    }
   
    public FeedingType getFeedingType(String typeName) {
    	FeedingType tipo=feedingRepository.findFeedingType(typeName);
        return tipo;
    }
    

    public List<FeedingType> getAllFeedingTypes(){
        List<FeedingType> f=feedingRepository.findAllFeedingTypes();
        return f;
    }
    
    public List<FeedingType> finAllFeedingTypes(){
    	List<FeedingType> ff=feedingRepository.findAllFeedingTypes();
    	return ff;
    }

    public Feeding save(Feeding p) throws UnfeasibleFeedingException {
        return null;       
    }

    
}
