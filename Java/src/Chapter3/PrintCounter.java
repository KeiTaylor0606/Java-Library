package Chapter3;

public class PrintCounter {
	
	public int count = 0; //printメゾットが呼ばれた回数を保持する
	
	public void print() {
		count++;
		System.out.println(count);
	}

}
