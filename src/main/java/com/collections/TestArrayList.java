package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		
		
		List<Integer> list1 =new ArrayList<>();
		list1.add(2);
		list1.add(150);
		list1.add(160);
		list1.add(120);
		list1.add(160);
		list1.add(160);
		
		List<String> list3 =new ArrayList<>();
		list3.add("hi");
		list3.add("hello");
		
		
		List  list2 =new ArrayList();
		list2.addAll(list1);
		list2.addAll(list3);
		
		list2.retainAll(list3);
		
		System.out.println(list2);
		
		
	}

}
