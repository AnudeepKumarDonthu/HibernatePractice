/**
 * 
 */
package hibernate.practice.dao;

import java.io.Serializable;

import org.hibernate.Session;

import hibernate.practice.model.User;
import hibernate.practice.util.GenerateHibernateSessionFactory;

/**
 * @author AnudeepKumar
 *
 */
public class CURDOperations {

	public boolean saveUser(User user) {
		Session session = GenerateHibernateSessionFactory.getSessionFactory();
		boolean flag = false;
		
		session.beginTransaction();
		{
			session.save(user);
			flag = true;
		}
		session.getTransaction().commit();
		return flag;
	}

}
