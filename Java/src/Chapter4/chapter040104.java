package Chapter4;

import java.util.Arrays;

public class chapter040104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,1,2,3,5,8,13};
		
		int[] newArray1 = new int[array.length + 3];
		System.arraycopy(array, 0, newArray1, 0, array.length);
		
		int[] newArray2 = Arrays.copyOf(array, array.length + 3);
		
		newArray1[7] = 21;
		newArray1[8] = 34;
		newArray1[9] = 55;

	}

}
