package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.PetGroomingCenter;

public interface PetGroomingCenterService 
{
	PetGroomingCenter addCenter(PetGroomingCenter request);
	
	List<PetGroomingCenter> displayAll();
	
	String deleteCenter(int id);

}
