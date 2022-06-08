package com.ty.ProductReview;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteProductReview {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Product product=new Product();
		Review reviews=entityManager.find(Review.class, 1);
		
		entityTransaction.begin();
		entityManager.remove(product);
		entityManager.remove(reviews);
		entityTransaction.commit();
		System.out.println("Reviews & Product are deleted!");
	}

}
