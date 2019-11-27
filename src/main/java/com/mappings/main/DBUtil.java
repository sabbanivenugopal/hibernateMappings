package com.mappings.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtil {

	public static SessionFactory getSf() {
		return new Configuration().configure().buildSessionFactory();
	}
}
