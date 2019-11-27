package com.mappings.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mappings.pojos.College;
import com.mappings.pojos.University;

public class LazyVsEager {
	
	public static void main(String[] args) {
		
		SessionFactory sf = DBUtil.getSf();
		Session session = sf.openSession();
		
		University uv=(University) session.get(University.class, 100);
		
		session.clear();
		
		System.out.println(uv.getUniName());
		System.out.println(uv.getClgList().get(0));
		
		/*
		 * List<College> clgList = uv.getClgList();
		 * 
		 * clgList.get(0);
		 * 
		 * System.out.println("end..");
		 */
		
	}

}
