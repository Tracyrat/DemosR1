package com.javasm.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set set = new HashSet();
		Set set2=new HashSet();
		set.add(1234);
		set.add(456);
		set.add("aa");
		set.add(new User("Tracy",22));
		set.add(new User("Tracy",22));
		List<Integer> asList = Arrays.asList(123,456);
		set.removeAll(asList);
		Iterator iterator = set.iterator();
		System.out.println(set.contains(123));
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}
}
