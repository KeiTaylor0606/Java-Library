package Chapter4;

public class chapter040106 {
	
	static void log(String message, String...args) {
		System.out.println(message);
		System.out.println("�p�����[�^�F");
		for(String arg : args) {
			System.out.println(arg);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log("�o�^", "username","ken");
	}

}
