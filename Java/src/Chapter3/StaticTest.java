package Chapter3;

public class StaticTest {
	static String staticField = "World";  //�N���X�t�B�[���h
	
	static String staticMethod() {  //�N���X���\�b�h
		return "yay!";
	}
	
	String instanceField = "Hello";  //�C���X�^���X�t�B�[���h
	
	String instanceMethod() {  //�C���X�^���X���\�b�h
		return instanceField + " " + staticField + " " + staticMethod();
	}

}
