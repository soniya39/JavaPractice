package com.collectionFrameworkExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class AscendingCompartor implements Comparator<StudentCollections>{

	@Override
	public int compare(StudentCollections s1, StudentCollections s2) {			
		return Integer.compare(s1.getId(), s2.getId());
	}
	
}
 class DescendingCompartor implements Comparator<StudentCollections>{

		@Override
		public int compare(StudentCollections s1, StudentCollections s2) {			
			return Integer.compare(s2.getId(),s1.getId());
		}
		
	}
 class NameComparator implements Comparator<StudentCollections>{

		@Override
		public int compare(StudentCollections s1, StudentCollections s2) {			
			return s1.getName().compareTo(s2.getName());
		}
		
	}
public class StudentCollectionsRunner {
	

	public static void main(String[] args) {
		List<StudentCollections> students = new ArrayList<StudentCollections>();
		students.add(new StudentCollections("Sony", 1));
		students.add(new StudentCollections("Abcd", 1));
		students.add(new StudentCollections("Soniya", 111));
		students.add(new StudentCollections("Sindu", 109));
		students.add(new StudentCollections("Indu", 10));
		
		//Collections.sort(students); //it will throws compilation error bcz we need to implements Comparable for Objects sorting
		
		for(StudentCollections student:students) {
			System.out.println(student.toStirng());
		}
		Collections.sort(students);
		for(StudentCollections student:students) {
			System.out.println(student.toStirng());
		}
		Collections.sort(students, new AscendingCompartor());	
		for(StudentCollections student:students) {
			System.out.println(student.toStirng());
		}
		Collections.sort(students, new DescendingCompartor());
		for(StudentCollections student:students) {
			System.out.println(student.toStirng());
		}
		Collections.sort(students, new NameComparator());
		for(StudentCollections student:students) {
			System.out.println(student.toStirng());
		}
	

	}

}
