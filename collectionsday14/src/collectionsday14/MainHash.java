package collectionsday14;

import java.util.*;
public class MainHash {

public static void main(String[] args) {
	
	BankAccount acc1 =new BankAccount("Daniel Samson",200000); 
	BankAccount acc2 =new BankAccount("Chris Daniel",100000); 
	BankAccount acc3 =new BankAccount("Morris Manio",49000); 
	
		HashMap bank =new HashMap();
		bank.put(45645,acc1);
		bank.put(45975,acc2);
		bank.put(45345,acc3);
		
		System.out.println("\n"+" Bank Account");
		System.out.println(bank.keySet());
		System.out.println(bank.values());
		System.out.println(bank);
		System.out.println(bank.keySet()+ " -- "+bank.values());
		
		Collection account =bank.values();
		
		for(Object b:account)
		{
			System.out.println(b);
		}
		
		Student s1= new Student("Naresh","CSE",1);
		Student s2= new Student("Suresh","EEE",4);
		Student s3= new Student("Gaesh","ECE",3);
		
		System.out.println("\n"+" Student");
		
		HashMap std =new HashMap();
		std.put(10056,s1);
		std.put(20056,s2);
		std.put(10089,s3);
		System.out.println(std.keySet());
		System.out.println(std.values());
		System.out.println(std);
		System.out.println(std.keySet()+ " -- "+std.values());
		System.out.println();
		
		Collection student =std.values();
		for(Object s:student)
		{
			System.out.println(s);
		}
		
		
		
		
		
		
	}
}
