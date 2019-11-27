package com.mappings.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mappings.pojos.Passport;
import com.mappings.pojos.Student;

public class Test {

	public static void main(String[] args) {
		
		//save();
		read();
	
	}

	private static void read() {
		Session session = DBUtil.getSf().openSession();
		//Student stu = (Student) session.get(Student.class, 4);
		
		
		
		  Passport pp =(Passport) session.get(Passport.class, "Z34343");
		  
		  System.out.println(pp.getPassportNum()+" "+pp.getExpireDate());
		  
		  Student stud = pp.getStud();
		  System.out.println(stud.getStuName()+" "+stud.getBranch());
		 
	}

	private static void save() {
		
		Student stu = new Student();
		stu.setBranch("CSE");
		stu.setStuName("Raj");
		stu.setClg("SNIS");
		
		Passport passport = new Passport();
		passport.setPassportNum("K3434");
		passport.setExpireDate("2029");
		passport.setLocation("KNR");
		
		passport.setStud(stu);
		stu.setPassport(passport);
		
		
		Session session = DBUtil.getSf().openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(passport);
		tx.commit();
		
		session.close();
	}
}
