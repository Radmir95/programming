package main.java.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory instance;
	
	private HibernateUtil(){}
	
	public static SessionFactory getInstance(){
		if (instance == null || instance.isClosed()){
			instance = new Configuration().configure().buildSessionFactory();
		}
			return instance;
	}
}
