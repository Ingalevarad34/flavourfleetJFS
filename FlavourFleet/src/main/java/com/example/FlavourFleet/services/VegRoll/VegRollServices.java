package com.example.FlavourFleet.services.VegRoll;

import java.util.List;
import com.example.FlavourFleet.Entities.VegRoll;

public interface VegRollServices {
	
	String addVegRoll(List<VegRoll> l);

	Iterable<VegRoll> getAllVegRoll();

	String deleteAllVegRoll();

	String deleteVegRollItem(int productId);

}
