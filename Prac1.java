package practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class Prac1 {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
    
		File file =new File("C:\\Users\\navee\\eclipse\\java-2019-12\\eclipse\\driver\\input.txt");
		
		if (file.createNewFile()){
			System.out.println("file created");
		}else
		{
			System.out.println("file not created");
		}
		
		
	}

}
