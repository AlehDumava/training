import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.text.BreakIterator;
import java.util.Locale;
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
				
				BreakIterator splitIntoSentences = BreakIterator.getSentenceInstance();
				BreakIterator wordIterator = BreakIterator.getWordInstance();
				
				
				while((getString = input.readLine()) != null) {
									
					splitIntoSentences.setText(getString);
					int index = 0;
					
					while (splitIntoSentences.next() != BreakIterator.DONE) {
						
				        String sentence = getString.substring(index, splitIntoSentences.current());
				        index = splitIntoSentences.current();
				        System.out.print(sentence);
				        
				        	wordIterator.setText(sentence);
				        	int start = wordIterator.first();
				        	int end = wordIterator.next();
				        	int counterWords = 0;
				        
				        	while (end != BreakIterator.DONE) {
				        	
				        		String word = sentence.substring(start, end);
				        		if (Character.isLetter(word.charAt(0))) {
				               		if (Character.isLetter(word.charAt(0))) {
				               			if (Character.isLetter(word.charAt(0))) {
				               				counterWords++;	        	    
				               			}
				               		}	
				        		}
				        		start = end;
				        		end = wordIterator.next();
				        		
				            }
				        	System.out.println("	Count words: " + counterWords);
				      }
					
				}
				System.out.println("+++++++++++++++++++++++++");
				
						
				
				input.close();
				output.close();
			}
			catch(FileNotFoundException e) {
				System.out.println("The file was not found!" + e);
				System.exit(0);
			}
		System.out.println("The file is copied.");
	}

}
