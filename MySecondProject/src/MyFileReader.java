import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileReader {



	public static void main(String[] args) throws IOException {
		
		System.out.println("Start reading the file");
		String path = "c://Users//User//git//training//MySecondProject//";
		String getString;
				
		try {
				BufferedReader input = new BufferedReader(new FileReader(path+"MyTextFile.txt"));
								
				BreakIterator splitIntoSentences = BreakIterator.getSentenceInstance();
				BreakIterator wordIterator = BreakIterator.getWordInstance();
				
				//Map<Integer, List<String>> treeMap = new TreeMap<>();
				List<Sentence> listSentence = new ArrayList<>();
				
				while((getString = input.readLine()) != null) {
									
					splitIntoSentences.setText(getString);
					int index = 0;
					
					while (splitIntoSentences.next() != BreakIterator.DONE) {
						
				        String sentence = getString.substring(index, splitIntoSentences.current());
				        index = splitIntoSentences.current();
				       
				        
				        	wordIterator.setText(sentence);
				        	int start = wordIterator.first();
				        	int end = wordIterator.next();
				        	int counterWords = 0;
				        
				        	while (end != BreakIterator.DONE) {
				        	
				        		String word = sentence.substring(start, end);
				        		if (Character.isLetter(word.charAt(0))) {
				               		if (Character.isLetter(word.charAt(0))) {
				               			if (Character.isLetter(word.charAt(0))) {
				               				counterWords++;	   						// Sentence number counter     	    
				               			}
				               		}	
				        		}
				        		start = end;
				        		end = wordIterator.next();
				        		
				            }
				        				        	
				        	listSentence.add(new Sentence(counterWords, sentence));
				        	
				        	//if (treeMap.containsKey(counterWords)) {
				        		
				        		//listSentence.add(sentence);
				        		//treeMap.put(counterWords, listSentence);
				        		//System.out.println(sentence);
				        		//System.out.println("================================");
				        		
				        	//} else {
				        	
				        	//	treeMap.put(counterWords, listSentence);
				        	//}
				      }
					
				}
				System.out.println("+++++++++++++++++++++++++");
				
										
				input.close();
								
				//for(Map.Entry<Integer, List<String>> element : treeMap.entrySet()) {
					 
				  //  System.out.println(element.getKey()+" "+ element.getValue());

				//}
				
				Collections.sort(listSentence, (o1, o2) -> o1.getCountWords() - o2.getCountWords());
				
				for(Sentence element : listSentence) {
					
					System.out.println(element.getCountWords()+" "+ element.getCountSentences());
				}
			}
			catch(FileNotFoundException e) {
				System.out.println("The file was not found!" + e);
				System.exit(0);
			}
		System.out.println("The file is sorted.");
	}

}
