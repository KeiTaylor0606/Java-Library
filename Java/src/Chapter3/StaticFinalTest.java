package Chapter3;

public class StaticFinalTest {
	static final String GREETING_MESSAGE = "Hello"; //�N���X�萔�̐錾
	
	static String staticField = "World";
	
	static String staticMethod() {
		return "yay!";
	}
	
	String instanceField = GREETING_MESSAGE;
	
	String instanceMethod() {
		return instanceField + " " + staticField + " " + staticMethod();
	}

}
