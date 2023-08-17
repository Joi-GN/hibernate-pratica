package client;

import entity.Message;
import util.HibernateUtil;

public class DeletingObjectsClient {

	public static void main(String[] args) {
		var session = HibernateUtil.getSessionfactory().openSession();
		var transaction = session.getTransaction();
		try {
			transaction.begin();
			UpdatingObjectsClient.main(args);
			var msg = (Message) session.get(Message.class, 2L);
			session.delete(msg);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) transaction.rollback();
			System.err.println("An error has occurred while attempting to manipulate an entity");
			e.printStackTrace();
		} finally {
			if(session != null) session.close();
		}
	}

}
