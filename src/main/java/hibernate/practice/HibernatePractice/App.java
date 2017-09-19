package hibernate.practice.HibernatePractice;

import org.hibernate.Session;

import hibernate.practice.model.User;
import hibernate.practice.util.GenerateHibernateSessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session=GenerateHibernateSessionFactory.getSessionFactory();
       User user1=new User();
//       User user1=new User();
       user1.setUserId(9);
       user1.setFirstName("kumar");
       user1.setLastName("donthu");
       user1.setCity("Bangalore");
       user1.setAddress("karnataka");
       session.beginTransaction();
       session.save(user1);
       session.getTransaction().commit();
       System.out.println("User Details saved...");
    }
}
