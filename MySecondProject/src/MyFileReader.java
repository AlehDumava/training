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

/*
 	Task 2.
 	Создать программу обработки текста учебника по программированию с использованием
 	классов (по необходимости) для представления: символа, слова, предложения, знака препинания и др.
 	Во всех задачах с формированием текста заменять табуляции и последовательности пробелов
 	одним пробелом. Программа должна обрабатывать адреса электронной почты и номера телефонов
 	в формате +ХХХ(ХХ)ХХХ-ХХ-ХХ как отдельные слова.
 	
 	Вариант 2.
 	Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них.
  
 */


public class MyFileReader {


	public static void main(String[] args) throws IOException {
		
		System.out.println("Start reading the file");
		String path = "c://Users//User//git//training//MySecondProject//";
		String getString;
		//int indexSentences = 0;
				
		try {
				BufferedReader input = new BufferedReader(new FileReader(path+"MyTextFile.txt"));
								
				BreakIterator splitIntoSentences = BreakIterator.getSentenceInstance();
				BreakIterator wordIterator = BreakIterator.getWordInstance();
				
				List<Sentence> listSentence = new ArrayList<>();
								
				
				while((getString = input.readLine()) != null) {
					
					splitIntoSentences.setText(getString);
					int index = 0;
					
					while (splitIntoSentences.next() != BreakIterator.DONE) {
						
				        String sentence = getString.substring(index, splitIntoSentences.current());
				        index = splitIntoSentences.current();
				           
			        			        
				        	wordIterator.setText(sentence);
				        	//System.out.println(indexSentences + "==" + sentence);	 
				        	//indexSentences++;
				        	
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
				        	
				      }
					
				}
															
				input.close();
				//System.out.println("+++++++++++++++++++++++++" + indexSentences);
								
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
