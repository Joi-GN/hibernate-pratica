package client;

import entity.Message;
import util.HibernateUtil;

public class UpdatingObjectsClient {

	public static void main(String[] args) {
		var session = HibernateUtil.getSessionfactory().openSession();
		var transaction = session.getTransaction();
		try {
//			begin transaction
			transaction.begin();
			HelloWorldClient.main(args);
			
//			The get method retrieves the message using the id provided as the parameter value (1L)
			var msg = (Message) session.get(Message.class, 1L);
			
//			Updating the message entity with the new string text passed as the parameter
			msg.setText("Automatic Dirty Checking");
			
//			Committing changes -> automatic dirty checking -> hibernate checks if the object had 
//			any modifications, if it does the it executes the update statement to persist the modifications
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) transaction.rollback();
			e.printStackTrace();
		} finally {
			if(session != null) session.close();
		}
		
	}

}
