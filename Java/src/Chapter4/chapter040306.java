package Chapter4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class chapter040306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		for(String element : list) {
			System.out.println(element);
		}
		
		for(Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ken", 100));
		students.add(new Student("Shin", 60));
		students.add(new Student("Takuya", 80));
		
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getScore() < 70) {
				iterator.remove();
			}
		}
		
		for(Student student : students) {
			System.out.println(student.getName() + ":" + student.getScore());
		}

	}

}
