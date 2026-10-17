package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.entity.PetGroomingCenter;
import com.klef.soa.exam.service.PetGroomingCenterServiceImpl;
	
@RestController
public class PetGroomingCenterController 
{
	@Autowired
	private  PetGroomingCenterServiceImpl service;
	
	@GetMapping("/")
	public String home()
	{
		return "CRUD Service is running";
	}
	
	@PostMapping("/add")
	public ResponseEntity<PetGroomingCenter> addCenter(@RequestBody PetGroomingCenter request)
	{
		PetGroomingCenter center = service.addCenter(request);
		
		return ResponseEntity.ok(center);
		
	}
	
	@GetMapping("/displayAll")
	public ResponseEntity<List<PetGroomingCenter>> displayAll()
	{
		List<PetGroomingCenter> centers = service.displayAll();
		
		return ResponseEntity.ok(centers);
	}
	
	@DeleteMapping("Delete/{id}")
	public ResponseEntity<String> deleteCenter(@PathVariable int id)
	{
		String center = service.deleteCenter(id);
		return ResponseEntity.ok(center);
	}

}
