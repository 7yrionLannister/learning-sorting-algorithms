package sorting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class insertionA {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("testcases/arraystosort.in");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		int archiveId = 1;
		while(line != null) {
			String[] sepInput = line.split(" ");
			int[] numbers = new int[sepInput.length];
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = Integer.parseInt(sepInput[i]);
			}
			
			File out = new File("testcases/insertionA-" + archiveId + ".out");
			PrintWriter pw = new PrintWriter(out);
			for(int i = 0; i < numbers.length; i++) {
				for(int j = 0; j < numbers.length; j++) {
					pw.print(numbers[j] + " ");
				}
				for(int j = i; j >= 0 && j + 1 < numbers.length; j--) {
					if(numbers[j+1] < numbers[j]) {
						int temp = numbers[j+1];
						numbers[j+1] = numbers[j];
						numbers[j] = temp;
					}
				}
				pw.println();
			}
			pw.close();
			archiveId += 1;
			line = br.readLine();
		}
	}
}
