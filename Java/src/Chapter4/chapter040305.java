package Chapter4;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class chapter040305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(1,1,4,5,7,8,11,12,17,21,24);
		int found = Collections.binarySearch(values, 5);	
		System.out.println(found);
		
		int notFound = Collections.binarySearch(values, 6);
		System.out.println(notFound);
	}

}
