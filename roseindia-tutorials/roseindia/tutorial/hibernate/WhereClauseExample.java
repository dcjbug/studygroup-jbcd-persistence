package roseindia.tutorial.hibernate;

import org.hibernate.Session;
import org.hibernate.*;
import org.hibernate.cfg.*;

import java.util.*;

/**
 * @author Deepak Kumar
 *
 * http://www.roseindia.net
 * HQL Where Clause Example
 * Where Clause With Select Clause Example
 */
public class WhereClauseExample {
	public static void main(String[] args) {
	Session session = null;

	try{
		// This step will read hibernate.cfg.xml and prepare hibernate for use
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		session =sessionFactory.openSession();
		 
	    System.out.println("*******************************");
	    System.out.println("Query using Hibernate Query Language");
		//Query using Hibernate Query Language
	 	String SQL_QUERY =" from Insurance as insurance where insurance.lngInsuranceId='1'";
	 	Query query = session.createQuery(SQL_QUERY);
	 	for(Iterator it=query.iterate();it.hasNext();){
	 		Insurance insurance=(Insurance)it.next();
	 		System.out.println("ID: " + insurance.getLngInsuranceId());
	 		System.out.println("Name: " + insurance.getInsuranceName());
	 		
	 	}
	 	System.out.println("*******************************");
	 	System.out.println("Where Clause With Select Clause");
		//Where Clause With Select Clause
	 	SQL_QUERY ="Select insurance.lngInsuranceId,insurance.insuranceName," +
	 	"insurance.investementAmount,insurance.investementDate from Insurance insurance "+ 
		" where insurance.lngInsuranceId='1'";
	 	query = session.createQuery(SQL_QUERY);
	 	for(Iterator it=query.iterate();it.hasNext();){
	 		Object[] row = (Object[]) it.next();
	 		System.out.println("ID: " + row[0]);
	 		System.out.println("Name: " + row[1]);
	 		
	 	}
	 	System.out.println("*******************************");

        session.close();
	}catch(Exception e){
		System.out.println(e.getMessage());
	}finally{
		}		
	}
}
