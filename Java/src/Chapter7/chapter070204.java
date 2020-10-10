package Chapter7;

public class chapter070204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "This     is a    pen.";
		
		System.out.println("(1)");
		System.out.println(sentence.matches("Th.* is a .*\\."));
		
		System.out.println("(2)");
		String[] words = sentence.split("\\s+");
		for(String word : words) {
			System.out.println(word);
		}
		
		System.out.println("(3)");
		System.out.println(sentence.replaceAll("\\s+", " "));

	}

}
