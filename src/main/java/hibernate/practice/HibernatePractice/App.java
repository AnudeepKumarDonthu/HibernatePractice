package hibernate.practice.HibernatePractice;

import java.util.Date;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import hibernate.practice.dao.CURDOperations;
import hibernate.practice.model.Details;
import hibernate.practice.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	
	private static final Logger logger=Logger.getLogger("App.class");

	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.setLevel(Level.TRACE);
		logger.info("Anudeep");
		CURDOperations cURDOperations = new CURDOperations();
		Employee emp1 = new Employee();
		Details details = new Details();
		// emp1.setUserId(3);
		emp1.setFirstName("Avinash Babu Donthu");
		emp1.setLastName("Donthu");
		emp1.setAddress("Hyderabad Telangana");
		emp1.setZipcode(560060);
		emp1.setJoindate(new Date());
		emp1.setDescription("I joined in Banaglore Location");
		details.setSalary(600000);
		details.setExperience("2 years 7 months");
		emp1.setDetails(details);
		logger.warn(emp1);
		if (cURDOperations.saveUser(emp1))
			System.out.println("Employee Details saved...");
		else
			System.out.println("Employee Details Not saved...");
		System.out.println("--------------------------------------------------------------------");
		Employee employee = cURDOperations.getData();
		if (null != employee) {
			System.out.println(employee.getUserId());
			System.out.println(employee.getFirstName());
			System.out.println(employee.getLastName());
			System.out.println(employee.getAddress());
			System.out.println(employee.getZipcode());
			System.out.println(employee.getJoindate());
			System.out.println(employee.getDescription());
		}
	}
}
