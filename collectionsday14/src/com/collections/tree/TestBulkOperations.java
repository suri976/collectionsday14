package com.collections.tree;
import java.util.*;

public class TestBulkOperations {
	public static void main(String[] args) {
		
		ArrayList<String> companies =new ArrayList<>();
		List<String> companiesList =new ArrayList<>();
		Collection <String> companiesColletion =new ArrayList<>();
		
		
		//retain all
		
		HashSet telecomSet = new HashSet();
		telecomSet.add("Reliance");
		telecomSet.add("jio");
		telecomSet.add("vodafone");
		telecomSet.add("idea");
		
		HashSet companySet = new HashSet();
		companySet.add("google");
		companySet.add("mi");
		companySet.add("samsung");
		companySet.add("tata");
		
		telecomSet.add(companySet);
		System.out.println(telecomSet);
		
	}

}
