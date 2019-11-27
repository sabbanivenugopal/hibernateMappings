package com.mappings.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mappings.pojos.Orders;

public class TestVersioning {

	public static void main(String[] args) {
		
		//save();
		
		update();
	}

	private static void update() {
		SessionFactory sf = DBUtil.getSf();
		Session session1 = sf.openSession();
		Session session2 = sf.openSession();
		
		Orders order1 =(Orders) session1.get(Orders.class, 1); //chrome (1	Hyd	97878787 	5)
		Orders order2 =(Orders) session2.get(Orders.class, 1); // firefox (1	Hyd	97878787 	5)
		
		
		order1.setMblNum("5948589459");
		session1.beginTransaction().commit(); //(1	Hyd	5948589459 	6)
		
		order2.setDeliveryLoc("Guntur");
		session2.beginTransaction().commit();  //
		
		session1.close();
		session2.close();
	}

	private static void save() {
		Orders ord= new Orders();
		ord.setDeliveryLoc("MIYAPUR-Hyd");
		ord.setMblNum("565656565");
		
		SessionFactory sf = DBUtil.getSf();
		
		Session session = sf.openSession();
		session.save(ord);
		session.beginTransaction().commit();
		session.close();		
	}
}
