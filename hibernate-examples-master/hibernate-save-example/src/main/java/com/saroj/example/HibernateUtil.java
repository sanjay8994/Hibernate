package com.saroj.example;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;




public class HibernateUtil {
  private static StandardServiceRegistry registry;
  private static SessionFactory sessionFactory;

  public static SessionFactory getSessionFactory() {
    if (sessionFactory == null) {
      try {
        StandardServiceRegistryBuilder registryBuilder =  new StandardServiceRegistryBuilder();

        Map<String, String> settings = new HashMap<>();
        settings.put("hibernate.connection.driver_class", "com.ibm.db2.jcc.DB2Driver");
        settings.put("hibernate.connection.url", "jdbc:db2://localhost:50000/EDGFT");
        settings.put("hibernate.connection.username", "DB2ADMIN");
        settings.put("hibernate.connection.password", "Compaqml2013");
        settings.put("hibernate.dialect","org.hibernate.dialect.DB2Dialect");       
        settings.put("hibernate.show_sql", "true");
        settings.put("hibernate.hbm2ddl.auto", "update");

        
        System.out.println("11111111111111");
        
        registryBuilder.applySettings(settings);
        
        System.out.println("22222222222222");


        registry = registryBuilder.build();

        MetadataSources sources = new MetadataSources(registry).addAnnotatedClass(User.class);

        System.out.println("333333333333333333");

        
        Metadata metadata = sources.getMetadataBuilder().build();
        
        System.out.println("4444444444444444");


        sessionFactory = metadata.getSessionFactoryBuilder().build();
      } catch (Exception e) {
        System.out.println("SessionFactory creation failed");
        if (registry != null) {
          StandardServiceRegistryBuilder.destroy(registry);
        }
      }
    }
    return sessionFactory;
  }

  public static void shutdown() {
    if (registry != null) {
      StandardServiceRegistryBuilder.destroy(registry);
    }
  }
}
