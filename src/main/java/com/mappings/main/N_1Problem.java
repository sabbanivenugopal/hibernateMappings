package com.mappings.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mappings.pojos.College;
import com.mappings.pojos.University;

public class N_1Problem {

	public static void main(String[] args) {
		
		SessionFactory sf = DBUtil.getSf();
		Session session = sf.openSession();
		
		Criteria q=session.createCriteria(University.class);
		q.setFirstResult(2);
		q.setMaxResults(4);
		List<University> list = q.list();


		for (University university : list) {
			System.out.println(university.getUniId()+" "+university.getUniName());
		}
		
		//Criteria cr = session.createCriteria(University.class).setFetchMode("clgList", FetchMode.JOIN);
		/*
		 * //List<University> uniList = cr.list(); // List<University> List<University>
		 * uniList =
		 * session.createQuery("from University u  join fetch u.clgList").list(); for
		 * (University university : uniList) {
		 * 
		 * System.out.println(university.getUniName() + " " +
		 * university.getUniLocation()); List<College> clgList =
		 * university.getClgList();
		 * 
		 * for (College college : clgList) { System.out.println(college.getClgName() +
		 * " " + college.getEstablished()); } }
		 */
	}
}
