package com.example.FlavourFleet.service.KfcServices;

import java.util.List;

import com.example.FlavourFleet.Entities.kfc;

public interface KfcServices {
	String addkfc(List<kfc> l);

	Iterable<kfc> getAllkfc();

	String deleteAllkfc();

	String deletekfcItem(int productId);

}
