package client;

import entity.Message;
import util.HibernateUtil;

public class HelloWorldClient {
	
	public static void main(String[] args) {
	
		var session = HibernateUtil.getSessionfactory().openSession();
		session.beginTransaction();
		
//		Hibernate 5
		session.save(new Message("Hello World with Hibernate"));
		session.save(new Message("Hello World with Hibernate 2"));
		
//		Hibernate 6
//		session.persist(message);
		
		session.getTransaction().commit();
		session.close();
	}
	
}
