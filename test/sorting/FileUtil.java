package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class FileUtil {
	public static boolean areEqualsTextFiles(String one, String two) {
		boolean equals = true;
		
		try {
			BufferedReader brOne = new BufferedReader(new FileReader(one));
			BufferedReader brTwo = new BufferedReader(new FileReader(two));
			
			String lineOne = brOne.readLine();
			String lineTwo = brTwo.readLine();
			
			int I = 1;
			while(equals && lineOne!=null && lineTwo!=null) {
				if(!lineOne.equals(lineTwo)) {
					equals = false;
					System.out.println("Lines #"+I+" are no equals from files: "+one+"|"+two);
				}
				lineOne = brOne.readLine();
				lineTwo = brTwo.readLine();				
			}
			
			if(equals && (lineOne!=null || lineTwo!=null)){
				equals = false;
				System.out.println("The files haven't the same lines amount: "+one+"|"+two);
			}
			
			brOne.close();
			brTwo.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			equals = false;
		}
		
		return equals;
	}
}
