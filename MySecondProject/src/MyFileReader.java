import java.io.*;

public class MyFileReader {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Start copy file");
		String path = "c:/Users/User/eclipse-workspace/MySecondProject/src/";
		String getString;
		
		try {
				BufferedReader input = new BufferedReader(new FileReader(path+"MyTextFile.txt"));
				BufferedWriter output = new BufferedWriter(new FileWriter(path+"MyNewTextFile.txt"));
				
				int countString = 1;
				
				while((getString = input.readLine()) != null) {
					output.write("["+countString+"]" + getString.toLowerCase());
					output.newLine();
					countString++;
				}
				
				input.close();
				output.close();
			}
			catch(FileNotFoundException e) {
				System.out.println("File not found!" + e);
			}
		System.out.println("The file is copyed.");
	}

}
