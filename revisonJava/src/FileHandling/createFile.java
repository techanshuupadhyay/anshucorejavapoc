package FileHandling;
import java.io.*;
public class createFile {

	public static void main(String[] args) throws  IOException {
		File f=new File("C:\\Users\\anshu\\Desktop\\Lc.text");
		
			if(f.createNewFile())
			{
				System.out.println("File Succefully Create...!");
			}
			else {
				System.out.println("File Already Exist...!");
			}
		
	}

}
