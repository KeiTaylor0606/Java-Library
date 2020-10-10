package Chapter7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class chapter070203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pattern pattern = Pattern.compile("\\s+");
		
		String sentence = "This         is a  pen.";
		
		Matcher matcher = pattern.matcher(sentence);
		
		System.out.println(matcher.replaceAll(" "));

	}

}
