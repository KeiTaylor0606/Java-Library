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
		//"."�͐��K�\���ł́u�C�ӂ̕����v�Ƃ��ē���ȈӖ�������
		/*
		 * ���ׁ̈u.�v��ʏ�̕����Ƃ��ĔF�������邽�߂ɁA
		 * �G�X�P�[�v�����ƌĂ΂��u\�v�𕶎��̑O�ɂ���K�v������
		 */
		for(String word : words1) {
			System.out.println(word);
		}

	}

}
