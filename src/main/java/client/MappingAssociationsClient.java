package client;

import entity.Message;
import entity.Person;
import util.HibernateUtil;

public class MappingAssociationsClient {

	public static void main(String[] args) {
		var session = HibernateUtil.getSessionfactory().openSession();
		var transaction = session.getTransaction();
		
		try {
			transaction.begin();
			var person = new Person("Ana");
			session.persist(new Message("Hello from Ana", person));
			
			var person2 = new Person("Bia");
			session.persist(new Message("Hello from Bia", person2));
			
			transaction.commit();
		} catch(Exception e) {
			if(transaction != null) transaction.rollback();
		} finally {
			if(session != null) session.close();
		}
	}

}
