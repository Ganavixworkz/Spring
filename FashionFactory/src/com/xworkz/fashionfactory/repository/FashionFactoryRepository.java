package com.xworkz.fashionfactory.repository;

import java.util.List;


import com.xworkz.fashionfactory.dto.FashionFactoryDto;
import com.xworkz.fashionfactory.entity.FashionFactoryEntity;


public interface FashionFactoryRepository {
public boolean onSave(FashionFactoryDto dto);
public List<FashionFactoryEntity> findAll();
public FashionFactoryEntity findById(int id) ;
public abstract List<FashionFactoryEntity> findByEmail(String email);
public boolean deleteById(int id);
public boolean updateById(FashionFactoryDto dto);


}
