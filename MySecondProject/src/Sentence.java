import java.util.Map;
import java.util.TreeMap;

public class Sentence {
	
	private Integer countWords; 
	private String countSentences;
	
	public Sentence(Integer countWords, String countSentences) {
		super();
		this.countWords = countWords;
		this.countSentences = countSentences;
	}

	public Integer getCountWords() {
		return countWords;
	}

	public String getCountSentences() {
		return countSentences;
	}
	
	
	
	//Map<Integer, String> treeMap = new TreeMap<>();

}
