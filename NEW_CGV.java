package day10;

import javax.swing.JOptionPane;

public class NEW_CGV {
	String ageMsg = "[û�ҳ� ���� �Ұ� ��ǰ]\n���̸� �Է��ϼ���.\n";
	int age;
	boolean t_check;
	boolean bookTicket(){
		boolean cCheck = false;
		String films = "����̿�ŷ(08:00)\n�轺���̴���(12:00)\n����Ϸ���(23:00)[û�ҳ� ���� �Ұ�]\n��ڷΰ���\n";
		int choice = Integer.parseInt(JOptionPane.showInputDialog(films));
		if(choice == 1) {
			JOptionPane.showMessageDialog(null, "���̿�ŷ ���ſϷ�(08:00)");
		} else if(choice == 2) {
			JOptionPane.showMessageDialog(null, "�����̴��� ���� �Ϸ�(12:00)");				
		} else if(choice == 3) {
			int age = Integer.parseInt(JOptionPane.showInputDialog(ageMsg));
			if(age > 19) {
			JOptionPane.showMessageDialog(null, "���Ϸ��� ���ſϷ�(23:00)");				
		} else {
			t_check = false;
			JOptionPane.showMessageDialog(null, "�̼����ڴ� �����Ұ��Դϴ�.");
		}
		}else {
		  JOptionPane.showMessageDialog(null, "���� �޴��� �̵��մϴ�.");
		  cCheck = true;
		}
		return cCheck;
	}
	
	public static void main(String[] args) {
		String helloMsg = "�� ������� CGV�Դϴ�. ��\n ������ ������ ���� ��Ÿ��� Ƽ��, ���� ��Ƽ�� �ϼ���!\n";
		String menuMsg = "�翹���ϱ�\n�豸���ϱ�\n������Ʈ ��ȸ\n�곪����\n";
		int choice = 0;
		int money = 10000000;
		int point = 0;
		int t_price = 10000;
		NEW_CGV c = new NEW_CGV();
		
		/*
		 * �����ϱ�
		 * 1.����
		 * 2.�ݶ�
		 * 3.����
		 * 4.�ڷΰ���
		 */
		
		while(true) {
		c.t_check = true;
		choice = Integer.parseInt(JOptionPane.showInputDialog(helloMsg + menuMsg));
		if(choice == 4) break;
		//�߸� �Է����� �� continue
		if(!(choice >= 1 && choice <= 3)) continue;
		
		switch(choice) {
		//�����ϱ� ����
		case 1:
			//������ ����
			if(money - t_price < 0) {
				JOptionPane.showMessageDialog(null, "�ܾ��� �����մϴ�.");
				continue;
			}
			if(c.bookTicket()) continue;
			
			if(c.t_check) {
				if(point > 0) {
					if(point - t_price >= 0) {
					point -= t_price;
					} else {
						money -= t_price;
					}
				} else {
				money -= t_price;
				point += (int)(t_price*0.1);
				}
				JOptionPane.showMessageDialog(null, "���� �ܾ� : " + money + "��");
			}
			break;
		//�����ϱ� ����
		case 2:
			break;
		//����Ʈ ��ȸ ����
		case 3:
			JOptionPane.showMessageDialog(null, "�ܿ� ����Ʈ : " + point + "��");
			break;
		}
	}
	
	}
}
