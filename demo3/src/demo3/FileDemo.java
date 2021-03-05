package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
//		char[] cbuf=new char[3];
		File file1=new File("D:\\my");
		boolean flag=file1.exists();
		if(flag==true)
			
		for (File file : fe) {
			System.out.println(file);
		}
		File file2=new File("src\\demo3\\hi");
		file1.renameTo(file2);
//		String[] str=file1.list();
//		for (String k : str) {
//			System.out.println(k);
//			
//		}
//		File file2=new File("src\\demo3\\lala;");
//		FileWriter fw=new FileWriter(file2);
//	    FileReader fr=new FileReader(file1);
//	    int j= fr.read(cbuf);
//		while(j!=-1)
//		{
//			fw.write(cbuf, 0, j);
//			j= fr.read(cbuf);
//		}
//		fr.close();
//		fw.close();
	}
	
}
