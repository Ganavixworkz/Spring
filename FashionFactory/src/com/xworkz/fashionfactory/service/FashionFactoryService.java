package com.xworkz.fashionfactory.service;

import java.util.List;


import com.xworkz.fashionfactory.dto.FashionFactoryDto;

public interface FashionFactoryService {
public boolean onSave(FashionFactoryDto dto);
public List<FashionFactoryDto> findAll();
public abstract FashionFactoryDto findById(int id);
public abstract List<FashionFactoryDto> findByEmail(String email);
public boolean deleteById(int id);
public boolean updateById(FashionFactoryDto dto);
}


