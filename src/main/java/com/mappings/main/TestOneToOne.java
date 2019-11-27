package com.mappings.main;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mappings.pojos.Employee;
import com.mappings.pojos.PanCard;

public class TestOneToOne {
	
	public static void main(String[] args) {
		
     	save();
		///read();
	}

	private static void read() {
		Session session = DBUtil.getSf().openSession();
		//PanCard em = (PanCard) session.get(PanCard.class, "BDQPG77777");
		Query q= session.createQuery("from PanCard where panNumber='BDQPG77777'");
		q.list();
	}

	private static void save() {
		
		Session session = DBUtil.getSf().openSession();
		
		Employee emp =new Employee();
		emp.setEmpName("Suresh");
		emp.setEmpSal("60K");
		
		PanCard p = new PanCard();
		p.setPanNumber("BDDDD939834");
		p.setPanCenter("Ameerpet-Hyd");
	
		p.setEmp(emp);
		emp.setPcard(p);
		
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
	}

}
