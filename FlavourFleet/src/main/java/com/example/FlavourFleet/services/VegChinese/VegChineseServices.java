package com.example.FlavourFleet.services.VegChinese;

import java.util.List;


import com.example.FlavourFleet.Entities.VegChinese;

public interface VegChineseServices {
	
	String addVegChinese(List<VegChinese> l);

	Iterable<VegChinese> getAllVegChinese();

	String deleteAllVegChinese();

	String deleteVegChineseItem(int productId);


}
