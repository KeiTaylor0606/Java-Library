package Chapter3;

public class chapter030103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String("Murata"); //Stringインスタンスの参照をname変数に保持する
		System.out.println(name.length());
		System.out.println(name);
		
		//文字列リテラル
		String name01 = "name01";
		System.out.println(name01);
		
		//nullリテラル
		String nullStr = null;  //nullリテラル
		if(null != null) { //nullチェック
			System.out.println(nullStr.length());
		}else {
			System.out.println("nullStrはnull");
		}

	}

}
