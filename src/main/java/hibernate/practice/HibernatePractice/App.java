package hibernate.practice.HibernatePractice;

import hibernate.practice.dao.CURDOperations;
import hibernate.practice.model.User;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		CURDOperations cURDOperations = new CURDOperations();
		User user1 = new User();
		user1.setUserId(5);
		user1.setFirstName("Anudeep Kumar Donthu");
		user1.setLastName("Anudeep Kumar");
		user1.setCity("Bangalore");
		user1.setAddress("karnataka");
		if (cURDOperations.saveUser(user1))
			System.out.println("User Details saved...");
		else
			System.out.println("User Details Not saved...");
	}
}
