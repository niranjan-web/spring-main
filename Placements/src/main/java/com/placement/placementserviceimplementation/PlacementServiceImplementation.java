package com.placement.placementserviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placement.entity.PlacementEntity;
import com.placement.placementservice.PlacementService;
import com.placement.repository.PlacementRepository;

@Service
public class PlacementServiceImplementation implements PlacementService{

	@Autowired
	PlacementRepository placerepo;
	
	@Override
	public void addPlacement(PlacementEntity place) {
		
		placerepo.save(place);
		
	}

}
