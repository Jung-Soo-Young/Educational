package sec06.ch04;

public class SwitchMission3 {
	public static void main(String[] args) {
		int season = (int)(Math.random() * 12) + 1; // Math.random() �޼ҵ带 1 ~ 12���� ������ ó��
		
		// season ���� 3 ~ 5 �̸� "��"
		// 6 ~ 8 �̸� "����"
		// 9 ~ 11 �̸� "����"
		// 12 ~ 2 �̸� "�ܿ�"
		
		switch(season) {
		case 3: case 4: case 5:
			System.out.println("��");
			break;
		case 6: case 7: case 8:
			System.out.println("����");
			break;
		case 9: case 10: case 11:
			System.out.println("����");
			break;
		default :
			System.out.println("�ܿ�");
		}
	}
}
