package collectionsday14;
import java.util.*;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet fruits = new TreeSet();
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("apple");
		System.out.println(fruits);
		
		TreeSet ranks = new TreeSet();
		ranks.add(2);
		ranks.add(9);
		ranks.add(6);
		System.out.println(ranks);
		
		Course c1= new Course("java123","java",20,3000.0);
		Course c2= new Course("c1","java",20,7000.0);
		Course c3= new Course("python78","python",20,6000.0);
		
		TreeSet courses = new TreeSet();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		//courses.add(courses)
		//courses.add(c1);
		System.out.println(courses);

	}

}
