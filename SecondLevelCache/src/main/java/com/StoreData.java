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
   
	// first session object
    Session session1 = factory.openSession();
    Transaction t1 = session1.beginTransaction(); 
  
    
   
    
   /* Employee e1=new Employee();    
    e1.setName("Sanjay");          
           
    session1.persist(e1);          
	t1.commit();
	session1.close();  

	// second session object
	Session session2 = factory.openSession();
    Transaction t2 = session2.beginTransaction(); 
     
    Employee e2=new Employee();    
    e2.setName("Ajay");                    
    session2.persist(e2);    
      
	t2.commit();
	session2.close();  
	*/
    
    Employee em1=session1.get(Employee.class,1);
    System.out.println(em1);
    t1.commit();
	session1.close();
	
	
	 Session session2 = factory.openSession();
	 Transaction t2 = session2.beginTransaction(); 
	  
	
	   Employee em2=session2.get(Employee.class,1);
	   System.out.println(em2);
	   t2.commit();
	   session2.close();
		
    System.out.println("successfully reterived");  
	factory.close();
      
}  
}  