package feb3rd;
import java.io.*;
public class Ex1 {
	public static void main(String args[]) {
		File inFile=new File("\\samplejavaproject2\\src\\feb3rd\\input.dat");
		File outFile=new File("\\samplejavaproject2\\src\\feb3rd\\op.dat");
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream(inFile);
			fos=new FileOutputStream(outFile);
			int ch;
			while((ch=fis.read())!=0) {
				fos.write(ch);
			}
			System.out.println("Op file created");
			System.out.println("data copied");
		}
		catch(IOException re) {
			System.out.println(re);
		}
		finally {
			try {
				fis.close();
				fos.close();
			}
			catch(IOException re) {
				
			}
		}
	}

}
