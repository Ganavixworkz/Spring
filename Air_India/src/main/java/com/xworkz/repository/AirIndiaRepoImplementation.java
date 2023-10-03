package com.xworkz.repository;

import javax.persistence.EntityManager;


import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.AirIndiaDto.AirIndiaDto;
import com.xworkz.entity.AirIndiaEntity;

public class AirIndiaRepoImplementation implements AirIndiaRepo{

	@Autowired
	EntityManagerFactory factory;
	
	@Override
	public boolean onSave(AirIndiaDto dto) {
		System.out.println("onSave Repo method");
		System.out.println(dto);
		
		AirIndiaEntity entity=new AirIndiaEntity();
		entity.setUserName(dto.getUserName());
		entity.setPhoneNumber(dto.getPhoneNumber());
		entity.setEmail(dto.getEmail());
		entity.setPassportNumber(dto.getPassportNumber());
		entity.setDateOfBirth(dto.getDateOfBirth());
		entity.setGender(dto.getGender());
		entity.setCountryCode(dto.getCountryCode());
		entity.setNationality(dto.getCountryCode());
		entity.setAddress(dto.getAddress());
		System.out.println(entity);
		
		EntityManager manager=factory.createEntityManager();
        EntityTransaction transaction=manager.getTransaction();
        transaction.begin();
        manager.persist(entity);
        transaction.commit();
        manager.close();
		
		return false;
	}

}
