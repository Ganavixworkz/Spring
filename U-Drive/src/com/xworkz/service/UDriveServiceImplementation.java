package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.xworkz.dto.UDriveDto;
import com.xworkz.repository.UDriveRepo;
import com.xworkz.repository.UDriveRepoImpl;

@Component
public class UDriveServiceImplementation implements UDriveService{
@Autowired
	UDriveRepo repo;
	@Override
	public boolean onSave(UDriveDto dto) {
		
		System.out.println("on save service method");
		repo.onSave(dto);
	
		return false;
		}
	}

