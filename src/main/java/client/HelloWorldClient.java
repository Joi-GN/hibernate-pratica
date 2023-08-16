package client;

import entity.Message;
import util.HibernateUtil;

public class HelloWorldClient {
	
	public static void main(String[] args) {
	
		var session = HibernateUtil.getSessionfactory().openSession();
		session.beginTransaction();
		
		var message = new Message("Hello World with Hibernate 2");
		session.save(message);
		
		session.getTransaction().commit();
		session.close();
	}
	
}
