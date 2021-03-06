package com.niit.HibernateDemo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	private static SessionFactory sessionfactory;

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		User employee = new User();
		//employee.setId(1);
		employee.setFirstName("Neha");
		employee.setLastName("solanki");
		employee.setSalary(20000);
		session.persist(employee);

		Transaction transaction = session.beginTransaction();
		transaction.commit();

	}
}
