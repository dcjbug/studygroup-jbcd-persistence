package roseindia.tutorial.hibernate;

import org.hibernate.Session;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.hibernate.cfg.*;
import java.util.*;
/**
 * @author Deepak Kumar
 * 
 * http://www.roseindia.net Hibernate Criteria Query Example
 *  
 */
public class HibernateCriteriaQueryExample2 {
	public static void main(String[] args) {
		Session session = null;
		try {
			// This step will read hibernate.cfg.xml and prepare hibernate for
			// use
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			//Criteria Query Example
			Criteria crit = session.createCriteria(Insurance.class);
			crit.add(Restrictions.like("insuranceName", "%a%")); //Like condition
			crit.setMaxResults(5); //Restricts the max rows to 5

			List insurances = crit.list();
			for(Iterator it = insurances.iterator();it.hasNext();){
				Insurance insurance = (Insurance) it.next();
				System.out.println("ID: " + insurance.getLngInsuranceId());
				System.out.println("Name: " + insurance.getInsuranceName());
				
			}
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
		}		
	}
}
