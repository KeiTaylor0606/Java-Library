package Chapter7;

public class chapter070106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "This is a pen";
		int index = sentence.indexOf("is");
		int index2 = sentence.indexOf("at");
		int index3 = sentence.indexOf("is", 3);
		int index4 = sentence.lastIndexOf("is");
		int index5 = sentence.lastIndexOf("is", 4);
		System.out.println(index);
		System.out.println(index2);
		System.out.println(index3);
		System.out.println(index4);
		System.out.println(index5);

	}

}
