package Chapter4;

import java.util.ArrayList;

public class chapter040303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Ken");
		names.add("Shin");
		names.add("Takuya");
		System.out.println(names.toString());
		
		names.add(2, "Satoshi");
		System.out.println(names.toString());
		
		names.set(0, "Makoto");
		System.out.println(names.toString());
		
		String thirdName = names.get(2);
		System.out.println(thirdName);
		
		names.remove(1);
		System.out.println(names.toString());
		
		int size = names.size();
		System.out.println(size);
		
		int takuyaIndex = names.indexOf("Takuya");
		System.out.println(takuyaIndex);
		
		boolean exists = names.contains("Shin");
		System.out.println(exists);

	}

}
