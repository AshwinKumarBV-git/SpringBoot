package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BikeEntity;
import com.example.demo.service.BikeService;
@RestController
public class BikeController {

	@Autowired
	public BikeService bikeService;
	@PostMapping("/add")
	public BikeEntity addBike(@RequestBody BikeEntity bikeEntity) {
		return bikeService.save(bikeEntity);
	}
	
	
}