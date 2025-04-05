package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BikeEntity;
import com.example.demo.repository.BikeRepository;

@Service
public class BikeServiceImpl implements BikeService
{
	@Autowired
	public BikeRepository bikeRepository;

	@Override
	public BikeEntity save(BikeEntity bikeEntity) {
		// TODO Auto-generated method stub
		return bikeRepository.save(bikeEntity);
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		bikeRepository.deleteAll();
		
	}	

	

}
