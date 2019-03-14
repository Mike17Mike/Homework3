package HW3.CS3310;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Creator<E extends Comparable<E>> {
	
	public void readFile() throws FileNotFoundException {
		File fileIn = new File("Sample.txt");
		Scanner inFile = new Scanner(fileIn);
		String url;
		String keyWordLine;
		
		while(inFile.hasNext()) {
			url = inFile.nextLine();
			keyWordLine = inFile.nextLine();
			
			for(int i =0; i < keyWordLine.length(); i++) {
				
			}
			
		}
	}
	

}
