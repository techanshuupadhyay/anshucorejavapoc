package StringEx;
// String Builder
public class StringEx1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Anshu");
		System.out.println(sb);
		
		//char at index 0
		System.out.println(sb.charAt(2));
		
		
		//set char at index
		sb.setCharAt(0, 'p');
		System.out.println(sb);
	
		
		// for  the insert we use .insert
		sb.insert(5, 'u');
		System.out.println(sb);
		
		// delete the extra 'n'
		sb.delete(2, 3);
		System.out.println(sb);
		
		
		//for print length we use .length
		System.out.println(sb.length());
		
	}

}
