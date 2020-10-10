package Chapter3;

public class StaticFinalTest {
	static final String GREETING_MESSAGE = "Hello"; //クラス定数の宣言
	
	static String staticField = "World";
	
	static String staticMethod() {
		return "yay!";
	}
	
	String instanceField = GREETING_MESSAGE;
	
	String instanceMethod() {
		return instanceField + " " + staticField + " " + staticMethod();
	}

}
