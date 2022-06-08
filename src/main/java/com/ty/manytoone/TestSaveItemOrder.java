package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveItemOrder {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Item item1=new Item();
		item1.setName("Working Table");
		item1.setPrice(4000);
		item1.setQuantity(1);
		
		Item item2=new Item();
		item2.setName("Working Chair");
		item2.setPrice(5000);
		item2.setQuantity(1);
		
		Item item3=new Item();
		item3.setName("Dell Laptop");
		item3.setPrice(60000);
		item3.setQuantity(1);
		
		AmazonOrder amazonOrder=new AmazonOrder();
		amazonOrder.setAddress("BTM Layout");
		amazonOrder.setName("Office Item");
		amazonOrder.setStatus("Getting preapred");
		
		item1.setAmazoneOrder(amazonOrder);
		item2.setAmazoneOrder(amazonOrder);
		item3.setAmazoneOrder(amazonOrder);
		
		entityTransaction.begin();
		entityManager.persist(amazonOrder);
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityManager.persist(item3);
		entityTransaction.commit();
	}

}
