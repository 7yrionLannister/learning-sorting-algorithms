package sorting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class selectionA {

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
			
			File out = new File("testcases/selectionA-" + archiveId + ".out");
			PrintWriter pw = new PrintWriter(out);
			
			for(int i = 0; i < numbers.length-1; i++) {
				for(int j = 0; j < numbers.length; j++) {
					pw.print(numbers[j] + " ");
				}
				int indMenor = i+1;
				for(int j = indMenor; j < numbers.length; j++) {
					if(numbers[indMenor] > numbers[j]) {
						indMenor = j;
					}
				}
				if(indMenor != i+1) {
					int temp = numbers[indMenor];
					numbers[indMenor] = numbers[i];
					numbers[i] = temp;
				}
				pw.println();
			}
			pw.close();
			line = br.readLine();
			archiveId += 1;
		}
	}
}
