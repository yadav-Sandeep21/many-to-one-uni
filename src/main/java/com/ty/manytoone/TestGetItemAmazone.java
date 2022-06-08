package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetItemAmazone {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Item item=entityManager.find(Item.class, 1);
		if(item!=null) {
			System.out.println(item.getAmazoneOrder());
			System.out.println(item.getName());
			System.out.println(item.getPrice());
		}
		else
		{
			System.out.println("No");
		}
		
	}

}
