package Chapter3;

public class chapter030103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String("Murata"); //String�C���X�^���X�̎Q�Ƃ�name�ϐ��ɕێ�����
		System.out.println(name.length());
		System.out.println(name);
		
		//�����񃊃e����
		String name01 = "name01";
		System.out.println(name01);
		
		//null���e����
		String nullStr = null;  //null���e����
		if(null != null) { //null�`�F�b�N
			System.out.println(nullStr.length());
		}else {
			System.out.println("nullStr��null");
		}

	}

}
