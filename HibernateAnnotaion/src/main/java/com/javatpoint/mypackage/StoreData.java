package com.javatpoint.mypackage;  
  
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

  
public class StoreData {  
public static void main(String[] args) {  
      
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

    System.out.println("22222222222222222222222");
    
    SessionFactory factory = meta.getSessionFactoryBuilder().build();
   
    
    Session session = factory.openSession();
    Transaction t = session.beginTransaction(); 
          
    Employee e1=new Employee();  
    e1.setId(101);  
    e1.setFirstName("sanjay");  
    e1.setLastName("chauhan");  
      
    session.save(e1);
	t.commit();
    System.out.println("successfully saved");  
	factory.close();
    session.close();  
      
}  
}  