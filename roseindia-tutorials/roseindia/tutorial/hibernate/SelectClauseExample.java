
package roseindia.tutorial.hibernate;

import org.hibernate.Session;
import org.hibernate.*;
import org.hibernate.cfg.*;

import java.util.*;

/**
 * @author Deepak Kumar
 *
 * http://www.roseindia.net
 * HQL Select Clause Example
 */
public class SelectClauseExample {
	public static void main(String[] args) {
	Session session = null;

	try{
		// This step will read hibernate.cfg.xml and prepare hibernate for use
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		session =sessionFactory.openSession();
		 
		//Create Select Clause HQL
	 	String SQL_QUERY ="Select insurance.lngInsuranceId,insurance.insuranceName," + 
		 "insurance.investementAmount,insurance.investementDate from Insurance insurance";
	 	Query query = session.createQuery(SQL_QUERY);
	 	for(Iterator it=query.iterate();it.hasNext();){
	 		Object[] row = (Object[]) it.next();
	 		System.out.println("ID: " + row[0]);
	 		System.out.println("Name: " + row[1]);
	 		System.out.println("Amount: " + row[2]);
	 	}
	 	
        session.close();
	}catch(Exception e){
		System.out.println(e.getMessage());
	}finally{
		}
	}
}
