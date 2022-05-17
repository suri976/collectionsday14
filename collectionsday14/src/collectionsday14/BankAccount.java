package collectionsday14;
import java.util.*;
public class BankAccount {
	
	String accountname;
	double salary;
	public BankAccount(String accountname, double id) {
		super();
		this.accountname = accountname;
		this.salary = id;
	}
	
	
	public String getAccountname() {
		return accountname;
	}


	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "BankAccount [accountname=" + accountname + ", salary=" + salary + "]";
	}
	
	
	
	

}
