package sec06.ch04;

public class SwitchMission2 {
	public static void main(String[] args) {
		String pos = "����";
		
		// pos ���� "����"�̸� "700����"
		// pos ���� "����"�̸� "500����"
		// ������ pos ���� "300����"
		switch(pos) {
		case "����" :
			System.out.println("700����");
			break;
		case "����" :
			System.out.println("500����");
			break;
		default:
			System.out.println("300����");
		}
	}
}
