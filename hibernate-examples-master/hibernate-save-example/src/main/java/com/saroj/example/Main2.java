package com.saroj.example;

import java.util.Date;

import org.hibernate.Session;

public class Main2 {
	
	public static void main(String[] args) {
		 User user1 = new User("saroj", new Date());
		 User user2 = new User("pratik", new Date());
		 
		 Session session = HibernateUtil.getSessionFactory().openSession();
		 session.persist(user1);
		 session.save(user2);
		 session.beginTransaction();
		 session.getTransaction().commit();
		 session.close();
		 
	}

}
