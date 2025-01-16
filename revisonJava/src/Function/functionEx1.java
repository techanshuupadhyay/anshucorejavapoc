package Function;

import java.util.Scanner;

public class functionEx1 {
	public static void printName(String name) {
		System.out.println(name);
		return;
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String name = sc.next();
		// TODO Auto-generated method stub
		
		printName(name);//call kiya function ko
		

	}

}
