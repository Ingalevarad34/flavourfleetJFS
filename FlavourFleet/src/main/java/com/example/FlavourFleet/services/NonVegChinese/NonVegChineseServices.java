package com.example.FlavourFleet.services.NonVegChinese;

import java.util.List;

import com.example.FlavourFleet.Entities.NonVegChinese;


public interface NonVegChineseServices {
	
	String addNonVegChinese(List<NonVegChinese> l);

	Iterable<NonVegChinese> getAllNonVegChinese();

	String deleteAllNonVegChinese();

	String deleteNonVegChineseItem(int productId);


}
