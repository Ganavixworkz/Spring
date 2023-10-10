package com.xworkz.fashionfactory.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.fashionfactory.dto.FashionFactoryDto;
import com.xworkz.fashionfactory.entity.FashionFactoryEntity;
import com.xworkz.fashionfactory.repository.FashionFactoryRepository;

@Service
public class FashionFactoryServiceImpl implements FashionFactoryService{
	@Autowired
FashionFactoryRepository repo;
	@Override
	public boolean onSave(FashionFactoryDto dto) {
		System.out.println("on Save method");
		repo.onSave(dto);
		return false;
	}
	@Override
	public List<FashionFactoryDto> findAll() {
List<FashionFactoryEntity> entityList=repo.findAll();
		
		List<FashionFactoryDto> dtoList=new ArrayList<FashionFactoryDto>();
		
	for(FashionFactoryEntity en:entityList) {
		System.out.println(en);
		FashionFactoryDto dto=new FashionFactoryDto();

		BeanUtils.copyProperties(en, dto);
		dtoList.add(dto);
	}
	System.out.println(dtoList.toString());
	return dtoList;
	
	}
	@Override
	public FashionFactoryDto findById(int id) {
System.out.println(id);
		
		FashionFactoryDto dto=new FashionFactoryDto();
		if(id!=0) {
			FashionFactoryEntity entity=repo.findById(id);
			if(entity!=null) {
				System.out.println("entity is not null");
				BeanUtils.copyProperties(entity, dto);
			}
			else {
				System.out.println("entity is null");
			}
		}
		return dto;
	}
	@Override
	public List<FashionFactoryDto> findByEmail(String email) {
		System.out.println(email);
	 	   List<FashionFactoryEntity> entity=repo.findByEmail(email);

			List<FashionFactoryDto> list=new ArrayList<FashionFactoryDto>();
	      
			for(FashionFactoryEntity en:entity) {
				System.out.println(en);
				FashionFactoryDto dto=new FashionFactoryDto();
				BeanUtils.copyProperties(en,dto );
				list.add(dto);
			}
			System.out.println(list.toString());
			return list;
	}
	@Override
	public boolean deleteById(int id) {
		boolean delete=false;
		if(id!=0) {
			delete=repo.deleteById(id);
			
		}
		if(delete!=true) {
			return false;
		}
		else {
			return true;
	
	}
	}
	@Override
	public boolean updateById(FashionFactoryDto dto) {
		System.out.println("updateById in service method");
		boolean update = repo.updateById(dto);

		return update;
	}

}
