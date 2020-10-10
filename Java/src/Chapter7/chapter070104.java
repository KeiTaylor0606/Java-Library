package Chapter7;

import java.util.List;
import java.util.ArrayList;


public class chapter070104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = new ArrayList<>();
		stringList.add("This");
		stringList.add("is");
		stringList.add("a");
		stringList.add("pen");
		
		StringBuilder message = new StringBuilder();
		for(String word : stringList) {
			message.append(word);
			message.append(" ");
		}
		
		if(message.length() > 0) {
			message.deleteCharAt(message.length() - 1);
		}
		
		System.out.println(message.toString());
		
		
		List<String> stringList2 = new ArrayList<>();
		stringList2.add("This");
		stringList2.add("is");
		stringList2.add("a");
		stringList2.add("pen");
		
		String message2 = String.join(" ", stringList2);
		
		System.out.println(message2);
		
		String message3 = String.join(".", "www", "acroquest", "co", "jp");
		
		System.out.println(message3);

	}

}
