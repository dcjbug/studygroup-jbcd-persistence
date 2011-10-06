package roseindia.tutorial.hibernate;
import org.hibernate.Session;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;
/**
 * @author Deepak Kumar
 * 
 * http://www.roseindia.net HQL Group by Clause Example
 *  
 */
public class HQLGroupByExample {
	public static void main(String[] args) {
		Session session = null;
		try {
			// This step will read hibernate.cfg.xml and prepare hibernate for
			// use
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			//Group By Clause Example
			String SQL_QUERY = "select sum(insurance.investementAmount),insurance.insuranceName "
					+ "from Insurance insurance group by insurance.insuranceName";
			Query query = session.createQuery(SQL_QUERY);
			for (Iterator it = query.iterate(); it.hasNext();) {
				Object[] row = (Object[]) it.next();
				System.out.println("Invested Amount: " + row[0]);
				System.out.println("Insurance Name: " + row[1]);
			}
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
		}
	}
}
