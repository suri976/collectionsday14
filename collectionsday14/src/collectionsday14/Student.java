package collectionsday14;

public class Student {

	String name,branch;
	int year;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Student(String name, String branch, int year) {
		super();
		this.name = name;
		this.branch = branch;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", branch=" + branch + ", year=" + year + "]";
	}
	
	
	
}
