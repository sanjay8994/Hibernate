package com.saroj.example;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class Main {

	public static void main(String[] args) {
		
		User user1 = new User("saroj", new Date());
		 User user2 = new User("pratik", new Date());
		 User user3 = new User("pream", new Date());
		 User user4 = new User("sanjay", new Date());
		 user4.setId(16);
		 Session session = HibernateUtil.getSessionFactory().openSession();
		 Transaction transaction = session.beginTransaction();
		
		  Serializable save = session.save(user1);
		  session.persist(user1);
		  System.out.println(save.toString());
		 /* session.saveOrUpdate(user2);
		 * session.saveOrUpdate(user3);
		 */
		 session.saveOrUpdate(user4);
		 session.getTransaction().commit();
		 
		 session.close();
	}
	
	
}
