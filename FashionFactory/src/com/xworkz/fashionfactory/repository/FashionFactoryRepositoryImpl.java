package com.xworkz.fashionfactory.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.fashionfactory.dto.FashionFactoryDto;
import com.xworkz.fashionfactory.entity.FashionFactoryEntity;



@Repository
public class FashionFactoryRepositoryImpl implements FashionFactoryRepository{
	@Autowired
EntityManagerFactory factory;
	@Override
	public boolean onSave(FashionFactoryDto dto) {
		System.out.println("on save repo method");
		System.out.println(dto);
		FashionFactoryEntity entity=new FashionFactoryEntity();
		BeanUtils.copyProperties (dto, entity); 
		System.out.println(entity);

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return false;
	}
	@Override
	public List<FashionFactoryEntity> findAll() {
		EntityManager manager = factory.createEntityManager();
		Query q = manager.createNamedQuery("findAll");

		List<FashionFactoryEntity> list = q.getResultList();
		System.out.println(list.toString());
		return list;
	}
	@Override
	public FashionFactoryEntity findById(int id) {
		System.out.println(id);
		EntityManager manager = factory.createEntityManager();
		FashionFactoryEntity entity = manager.find(FashionFactoryEntity.class, id);

		return entity;
	}
	@Override
	public List<FashionFactoryEntity> findByEmail(String email) {
		System.out.println(email);
		EntityManager manager = factory.createEntityManager();
      Query query=manager.createNamedQuery("findByEmail");
      query.setParameter("e", email);
      List<FashionFactoryEntity> list=query.getResultList();
      System.out.println(list.toString());
		return list;
	}
	@Override
	public boolean deleteById(int id) {
		EntityManager manager=factory.createEntityManager();
		FashionFactoryEntity entity=manager.find(FashionFactoryEntity.class, id);
		if(entity!=null) {
			System.out.println(entity);
			manager.getTransaction().begin();
			manager.remove(entity);
			manager.getTransaction().commit();
			manager.close();
			return true;
		}else {
		return false;
	
	}
		
	}
	@Override
	public boolean updateById(FashionFactoryDto dto) {
		EntityManager manager = factory.createEntityManager();
		FashionFactoryEntity entity=new FashionFactoryEntity();
		manager.getTransaction().begin();
		BeanUtils.copyProperties(dto, entity);
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();
		return true;
		
	}
}


