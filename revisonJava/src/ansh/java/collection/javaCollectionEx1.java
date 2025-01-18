package ansh.java.collection;
import java.util.*;
public class javaCollectionEx1 {

	public static void main(String[] args) {
		
		
		ArrayList<String> Name=new ArrayList<String>();
		Name.add("Anshu");
		Name.add("Ankit");
		Name.add("golu");
		
		
		System.out.println(Name);
		Name.add("Rohit");
		System.out.println(Name);
		Name.add(1,"ihu");
		System.out.println(Name);
		Name.add(0, "Kunal");
		System.out.println(Name);
		
		Name.remove(0);
		System.out.println(Name);
		
		Name.set(1, "priyotma");
		System.out.println(Name.get(2));
		  
	}

}
