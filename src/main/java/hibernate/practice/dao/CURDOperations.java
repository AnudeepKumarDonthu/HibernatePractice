/**
 * 
 */
package hibernate.practice.dao;

import java.util.List;

import org.hibernate.Session;

import hibernate.practice.model.Employee;
import hibernate.practice.util.GenerateHibernateSessionFactory;

/**
 * @author AnudeepKumar
 *
 */
public class CURDOperations {
	Session session = GenerateHibernateSessionFactory.getSessionFactory();

	public boolean saveUser(Employee emp) {

		boolean flag = false;

		session.beginTransaction();
		if (null != emp) {
			session.save(emp);
			flag = true;
		}
		session.getTransaction().commit();
		//session.close();
		return flag;
	}

	public Employee getData() {
		session.beginTransaction();
		Employee employeeData = new Employee();
		employeeData=(Employee) session.get(Employee.class,27);
		return employeeData;

	}

}
