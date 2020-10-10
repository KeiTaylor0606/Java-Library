package Chapter7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class chapter070201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pattern = Pattern.compile("This is a .*\\.");
		
		String sentence = "This is a pen.";
		
		Matcher matcher = pattern.matcher(sentence);
		
		if(matcher.matches()) {
			System.out.println("OK");
		}
		else {
			System.out.println("NOT");
		}

	}

}
