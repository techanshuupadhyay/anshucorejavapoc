package Function;

import java.util.Scanner;

public class FunctionEx3 {
	public static int calculateProduct(int a,int b) {
		return a*b;
	}

	public static void main(String[] args) {
			Scanner sc  = new Scanner(System.in);
			int a = sc.nextInt();
		    int  b = sc.nextInt();
		    
		    System.out.println("product of 2 num is :" + calculateProduct(a,b));
	}

}
