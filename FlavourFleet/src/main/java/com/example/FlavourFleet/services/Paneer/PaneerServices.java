package com.example.FlavourFleet.services.Paneer;

import java.util.List;

import com.example.FlavourFleet.Entities.Paneer;

public interface PaneerServices {
	
	
	
	String addPaneer(List<Paneer>l);
	Iterable<Paneer> getPaneer();

	String deleteAllPaneer();

	String deletePaneerItem(int productId);


}
	