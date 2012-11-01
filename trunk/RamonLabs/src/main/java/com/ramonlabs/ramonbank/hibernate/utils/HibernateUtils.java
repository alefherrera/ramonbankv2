package com.ramonlabs.ramonbank.hibernate.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	/*private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;

	static {
		configureSessionFactory();		
	}
	
	private static SessionFactory configureSessionFactory() throws HibernateException {
	    Configuration configuration = new Configuration();
	    configuration.configure();
	    serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
	    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    return sessionFactory;
	}
	
	public static Session getSession() throws HibernateException {
		return sessionFactory.openSession();
    }
	
	public static void shutdown() {
		sessionFactory.close();
	}
	*/
}
