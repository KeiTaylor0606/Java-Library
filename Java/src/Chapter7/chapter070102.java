package Chapter7;

public class chapter070102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//(1)StringBuilderクラスの使用
		String aaa = "aaa";
		String bbb = "bbb";
		
		StringBuilder builder = new StringBuilder();
		builder.append(aaa);
		builder.append(bbb);
		
		String str = builder.toString();
		System.out.println(str);
		
		//(2)+演算子を使用
		String str1 = aaa + bbb;
		System.out.println(str1);
		
		//(3)Stringクラスのconcatメゾットを使用
		String str2 = aaa.concat(bbb);
		System.out.println(str2);
	}

}
