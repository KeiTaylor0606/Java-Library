package Chapter4;

import java.util.Scanner;

public class chapter040101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		for(int i = 0; i < 10; i++) {
			array[i] = sc.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(array[i]);
		}

	}

}
