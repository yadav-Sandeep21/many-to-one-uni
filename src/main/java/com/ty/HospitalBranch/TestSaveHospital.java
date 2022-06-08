package com.ty.HospitalBranch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveHospital {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Branch branch1=new Branch();
		branch1.setName("BTM");
		branch1.setState("Karnataka");
		branch1.setCountry("India");
		branch1.setPhone(234563456l);
		
		Branch branch2=new Branch();
		branch2.setName("Varanasi");
		branch2.setState("UP");
		branch2.setCountry("India");
		branch2.setPhone(563456l);
		
		Branch branch3=new Branch();
		branch3.setName("Ghazipur");
		branch3.setState("Karnataka");
		branch3.setCountry("India");
		branch3.setPhone(2345456l);
		
		Hospital hospital=new Hospital();
		hospital.setName("Apallo");
		hospital.setWeb("Practo");
		
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		branch3.setHospital(hospital);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityTransaction.commit();
	}
}
