import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileReader {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Start copy file");
		String path = "c://Users//User//git//training//MySecondProject//";
		String getString;
		
		try {
				BufferedReader input = new BufferedReader(new FileReader(path+"MyTextFile.txt"));
				BufferedWriter output = new BufferedWriter(new FileWriter(path+"MyNewTextFile.txt"));
				
				int countString = 1;
				
				while((getString = input.readLine()) != null) {
					System.out.println(getString);
					output.write("["+countString+"]" + getString.toLowerCase());
					output.newLine();
					countString++;
				}
				
				input.close();
				output.close();
			}
			catch(FileNotFoundException e) {
				System.out.println("The file was not found!" + e);
				System.exit(0);
			}
		System.out.println("The file is copyed.");
	}

}
