package FileHandling;
import java.io.*;

public class renameFile {

	public static void main(String[] args) {
		
		File f=new File("C:\\\\\\\\Users\\\\\\\\anshu\\\\\\\\Desktop\\\\\\\\Lc.text");
		File r=new File("C:\\\\\\\\Users\\\\\\\\anshu\\\\\\\\Desktop\\\\\\\\Anshu.text");

		
		if(f.exists())
		{
			System.out.println(f.renameTo(r));
		}
		else
		{
			System.out.println("File doesn't exists..!");
		}
	}
  
}
