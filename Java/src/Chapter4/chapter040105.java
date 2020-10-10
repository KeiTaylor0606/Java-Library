package Chapter4;

import java.util.Arrays;
import java.util.Comparator;

public class chapter040105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�z��̕�����ϊ�
		int[] array1 = {1,1,2,3,5,8,13};
		System.out.println(array1);
		System.out.println(Arrays.toString(array1));
		
		//�z��̃\�[�g
		int[] array2 = {3,1,13,2,8,5,1};
		Arrays.sort(array2);
		System.out.println(Arrays.toString(array2));
		
		//
		Integer[] array3 = {3,1,13,2,8,5,1};
		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};
		
		Arrays.sort(array3, c);
		System.out.println(Arrays.toString(array3));
		
		//Student�I�u�W�F�N�g�̔z���_���Ń\�[�g
		Student[] students = {
				new Student("Ken", 100),
				new Student("Shin", 60),
				new Student("Takuya", 80)
		};
		
		Comparator<Student> comparator = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o2.getScore(), o1.getScore());
			}
		};
		
		Arrays.sort(students, comparator);
		for(Student student : students) {
			System.out.println(student.getName() + ":" + student.getScore());
		}
		
		//�z��̌���
		int[] array4 = {1,1,4,5,7,8,11,12,17,21,24};
		int found = Arrays.binarySearch(array4, 5);
		System.out.println(found);
		
		int notFound = Arrays.binarySearch(array4, 6);
		System.out.println(notFound);
		
		//�񕪒T��
		int[] array5 = {3,1,13,2,8,5,1};
		Arrays.sort(array5);
		int value = Arrays.binarySearch(array5, 8);
		System.out.println(value);

	}

}
