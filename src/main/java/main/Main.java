package main;


import java.text.ParseException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;



import main.entity.Employee;
import main.entity.Person;
import main.entity.Student;
import main.model.Address;
import main.utils.HibernateUtil;

public class Main {
	public static void main(String[] args) throws ParseException {
		Logger logger = (Logger) LogManager.getLogger();

		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
	    	Person person = new Person();
			person.setName("Sudha Verma");
			person.setGender("Female");
			
			
//			Employee employee = new Employee();
//			employee.setBonus(new BigDecimal("277.389"));
//			employee.setDeptName("IT");
//			employee.setDoj(HibernateUtil.getDoj("18/12/2015"));
//			employee.setEmail("dipesh.cs@gmail.com");
//			employee.setName("Dipesh");
//			employee.setSalary(80000.2872);
//			employee.setGender("Male");
//			
//			Student student = new Student();
//			student.setName("Shuruti");
//			student.setGender("Female");
//			student.setFee(20000.00f);
//			student.setSchoolName("DPS");
//			student.setSectionName("12th Std");
			
			session.beginTransaction();
			session.save(person);
//			session.save(student);
//			session.save(employee);
			
			session.getTransaction().commit();
			int id =1;
			Person person2 = session.get(Person.class, id);
			if(person2 !=null) {
				//System.out.println(person2);
				logger.info(person2);
			} else {
				logger.warn("person with id "+id +" not found! ");
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
		
		
	  }

}
