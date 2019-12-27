package com;  
  
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
    e1.setName("Sanjay");    
        
    RegularEmp e2=new RegularEmp();    
    e2.setName("ajay");    
    e2.setSalary(50000);    
    e2.setBonus(5);    
        
    ContEmp e3=new ContEmp();    
    e3.setName("fffff");    
    e3.setPay_per_hour(1000);    
    e3.setContract_duration("15 hours");    
        
    session.persist(e1);    
    session.persist(e2);    
    session.persist(e3);    
    
	t.commit();
    System.out.println("successfully saved");  
	factory.close();
    session.close();  
      
}  
}  