
package roseindia.tutorial.hibernate;

import org.hibernate.Session;
import org.hibernate.*;
import org.hibernate.cfg.*;

import java.util.*;

/**
 * @author Deepak Kumar
 *
 * http://www.roseindia.net
 * Select HQL Example
 */
public class SelectHQLExample {

	public static void main(String[] args) {
	Session session = null;

	try{
		// This step will read hibernate.cfg.xml and prepare hibernate for use
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		 session =sessionFactory.openSession();
		 
		 
			//Using from Clause
		 	String SQL_QUERY ="from Insurance insurance";
		 	Query query = session.createQuery(SQL_QUERY);
		 	for(Iterator it=query.iterate();it.hasNext();){
		 		Insurance insurance=(Insurance)it.next();
		 		System.out.println("ID: " + insurance.getLngInsuranceId());
		 		System.out.println("First Name: " + insurance.getInsuranceName());
		 	}
		 	
	        session.close();
	}catch(Exception e){
		System.out.println(e.getMessage());
	}finally{
		}

	}	
}
