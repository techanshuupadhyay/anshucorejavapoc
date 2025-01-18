package FileHandling;
import java.io.*;
import java.io.FileWriter;

public class fileWriter {

	public static void main(String[] args) {
		try
		{
			FileWriter f=new FileWriter("C:\\\\Users\\\\anshu\\\\Desktop\\\\Lc.text");
			try
			{
				f.write("java programming is the best language");
			}
			finally
			{
				f.close();
			}
			System.out.println("Succesfully  data wrote in file");
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
	}
	

}
