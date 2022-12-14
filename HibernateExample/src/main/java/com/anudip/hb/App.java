package com.anudip.hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.anudip.hb.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		// object of entity
		Student student = new Student();

		student.setsId(104);
		student.setSname("Jyotsna Zade");
		student.setSemil("jyotsnazade5@gmail.com");
		student.setSage(22);
		student.setSedu("BEEC");
		student.setSphone(895657919);

//    	student.setsId(12);
//    	student.setSname("Rahul");
//    	student.setSemil("r@gmail.com");
//    	student.setSage(23);
//    	student.setSedu("BECS");
//    	student.setSphone(724894342);

		// saving entity object by using save()
		session.save(student);

		// commiting the transaction in Database
		transaction.commit();

		System.out.println("Inserted Successfully");

		session.close();
    }
}
