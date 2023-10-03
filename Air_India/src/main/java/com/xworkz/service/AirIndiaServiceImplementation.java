package com.xworkz.service;

import com.xworkz.AirIndiaDto.AirIndiaDto;
import com.xworkz.repository.AirIndiaRepo;

public class AirIndiaServiceImplementation implements AirIndiaService{

	AirIndiaRepo repo;
	@Override
	public boolean onSave(AirIndiaDto dto) {
		System.out.println("onSave Service method");
		repo.onSave(dto);
		return false;
	}

}
