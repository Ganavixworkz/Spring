package com.xworkz.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.UDriveDto;
import com.xworkz.entity.UDriveEntity;

@Component
public class UDriveRepoImpl implements UDriveRepo{
@Autowired
	EntityManagerFactory factory;
	@Override
	public boolean onSave(UDriveDto dto) {
		System.out.println(" on save repo method");
		System.out.println(dto);
		
		UDriveEntity entity=new UDriveEntity();
		entity.setUserName(dto.getUserName());
		entity.setPhoneNumber(dto.getPhoneNumber());
		entity.setEmail(dto.getEmail());
		entity.setAadharNo(dto.getAadharNo());
		entity.setPanNo(dto.getPanNo());
		entity.setDuration(dto.getDuration());
        entity.setUserDl(dto.getUserDl());
        entity.setAmount(dto.getAmount());
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
