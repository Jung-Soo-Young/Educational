package sec06.ch04;

public class IfMission2Another2 {
	public static void main(String[] args) {
		//IfMission2Another�� �����Ͽ� �ذ��Ͻÿ�. (�����Ϸ��� ����Ͻÿ�)
		//����� ������ ��Ÿ������ �Ͻÿ�.
		
		//��, 174 >>> ���� ��� �̸�
		//��, 175 >>> ���� ���
		//��, 176 >>> ���� ��� �ʰ�
		
		//��, 162 >>> ���� ��� �̸�
		//��, 163 >>> ���� ���
		//��, 164 >>> ���� ��� �ʰ�
		
		String gender = "��"; //"��", "��";
		int height = 162;
		
		String displayGender = "����", displayResult = "���";
		//���� ���� �ʱⰪ�� ��� ���� �ʱⰪ�� ����
		
		final int MAN_STAND = 176; // ���� ��� Ű ���� ���� ����
		final int WOMAN_STAND = 163; // ���� ��� Ű ���� ���� ����
		int stand = MAN_STAND; // Ű ���� ������ ���� ���� = �⺻ �� ���� ��� Ű�� ����
		
		if (gender.equals("��")) {
			stand = WOMAN_STAND; // ������ "��"�� ��� �⺻ ��(���� ��� Ű)���� ���� ��� Ű�� ����
			displayGender = "����"; // ���� ���� "����"�� ����
		}
		
		if(height < stand) { // �־��� ���� ����(��� Ű) ���� ������?
			displayResult = "��� �̸�"; // ��� ���� -> "��� �̸�" ����
		} else if (height > stand) { // �־��� ���� ����(��� Ű) ���� ū��?
			displayResult = "��� �ʰ�"; // ��� ���� -> "��� �ʰ�" ����
		} 
		System.out.printf("%s - %dcm : %s\n", displayGender, height, displayResult); // ���
	}
}
