package Chapter3;

public class chapter030204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(StaticTest.staticField);
		System.out.println(StaticTest.staticMethod());
		
		StaticTest.staticField = "Japan";
		System.out.println(StaticTest.staticField);
		
		StaticTest test = new StaticTest();
		System.out.println(test.staticField);
		System.out.println(test.staticMethod());
		System.out.println(test.instanceMethod());
		
		test.staticField = "Murata";
		System.out.println(test.instanceMethod());
		
		test.instanceField = "Hi";
		System.out.println(test.instanceMethod());
		
		StaticTest test2 = new StaticTest();
		
		test2.staticField = "Okada";
		System.out.println(StaticTest.staticField);
		System.out.println(test.staticField);
		System.out.println(test2.staticField);
		System.out.println(test2.instanceMethod());
		
		test2.instanceField = "Yo";
		System.out.println(test2.instanceMethod());
		System.out.println(test.instanceMethod());
		
		
		System.out.println(StaticFinalTest.GREETING_MESSAGE);
		System.out.println(StaticFinalTest.staticField);
		System.out.println(StaticFinalTest.staticMethod());
		
		//StaticFinalTest GREETING_MESSAGE = "Hello"; コンパイルエラー
		
		StaticFinalTest.staticField = "Japan";
		
		StaticFinalTest finaltest = new StaticFinalTest();
		
		System.out.println(finaltest.instanceMethod());
		
	}

}
