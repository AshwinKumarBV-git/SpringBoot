package com.example.demo.repository;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BikeEntity;

public interface BikeRepository 
extends JpaRepository<BikeEntity, Integer>  {

}
