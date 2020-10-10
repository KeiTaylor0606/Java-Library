package Chapter7;

public class chapter070103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "This is a pen.";
		String[] words = sentence.split(" ");
		
		for(String word : words) {
			System.out.println(word);
		}
		
		String url = "www.acroquest.co.jp";
		String[] words1 = url.split("\\.");
		//"."は正規表現では「任意の文字」として特殊な意味を持つ
		/*
		 * その為「.」を通常の文字として認識させるために、
		 * エスケープ文字と呼ばれる「\」を文字の前につける必要がある
		 */
		for(String word : words1) {
			System.out.println(word);
		}

	}

}
