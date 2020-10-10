package Chapter3;

public class StaticFinalTest {
	static final String GREETING_MESSAGE = "Hello"; //ƒNƒ‰ƒX’è”‚ÌéŒ¾
	
	static String staticField = "World";
	
	static String staticMethod() {
		return "yay!";
	}
	
	String instanceField = GREETING_MESSAGE;
	
	String instanceMethod() {
		return instanceField + " " + staticField + " " + staticMethod();
	}

}
