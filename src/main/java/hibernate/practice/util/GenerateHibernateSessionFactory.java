/**
 * 
 */
package hibernate.practice.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author AnudeepKumar
 *
 */
public class GenerateHibernateSessionFactory {

	public static Session getSessionFactory() {
		SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		return session;
	}

}
