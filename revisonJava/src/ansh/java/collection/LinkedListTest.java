package ansh.java.collection;
import java.util.*;
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<String>();
		name.add("Anshu");
		name.add("Ankit");
		name.add("golu");
		
		
		
		System.out.println(name);
		name.addFirst("Prii");
		System.out.println(name);
		name.addLast("Dj");
		System.out.println(name);
		name.add(3, "Om");
		System.out.println(name);
	}

	}


