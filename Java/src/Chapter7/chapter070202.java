package Chapter7;

import java.util.regex.Pattern;

public class chapter070202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("\\s+");
		
		String sentence = "This         is a  pen.";
		
		String[] words = pattern.split(sentence);
		
		for(String word : words) {
			System.out.println(word);
		}

	}

}
