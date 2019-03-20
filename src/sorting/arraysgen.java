package sorting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class arraysgen {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("testcases/arraystosort.in"));
		
		int testcases = 10;
		int amount = 5;
		int maxValue = 1000;
		
		for (int i = 0; i < testcases; i++) {
			for (int j = 0; j < amount; j++) {
				int x = (int)(Math.random()*maxValue);
				bw.write(x+" ");
			}
			bw.write("\n");
			amount++;
		}
		
		bw.close();
	}
}
