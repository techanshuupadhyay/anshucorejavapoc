package FileHandling;
import java.io.*;
import java.io.FileInputStream;

public class copyFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream r=new FileInputStream("C:\\Users\\anshu\\Desktop\\Anshu.text");
		FileOutputStream w=new FileOutputStream("C:\\Users\\anshu\\Desktop\\Prii.text");
		
		int i;
		while((i=r.read())!=-1)
		{
			w.write((char)i);
		}
			
		System.out.println("Data copid successfully...!");
	}

}
