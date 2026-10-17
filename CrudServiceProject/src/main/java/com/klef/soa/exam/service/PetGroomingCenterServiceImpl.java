package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.PetGroomingCenter;
import com.klef.soa.exam.repository.PetGroomingCenterRepository;

@Service
public class PetGroomingCenterServiceImpl implements PetGroomingCenterService
{
	@Autowired
	private PetGroomingCenterRepository repository;

	@Override
	public PetGroomingCenter addCenter(PetGroomingCenter request) {
		PetGroomingCenter center =repository.save(request);
		return center;
	}

	@Override
	public List<PetGroomingCenter> displayAll() {
		return repository.findAll();
	}

	@Override
	public String deleteCenter(int id) {
		
		boolean status = repository.existsById(id);
		if(status)
		{
			repository.deleteById(id);
			return "Center Deleted Successfully";
		}
		else {
			return "Id Not Found";
		}
		
	}

}
