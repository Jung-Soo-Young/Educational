package day08;

import javax.swing.JOptionPane;

public class NestedFor {
	//����Ű
	//������, ȫ����, ������
	//����, Ű��
	//������K, ȫ����K, ������K
	//������A, ȫ����A, ������A
	
	public static void main(String[] args) {
/*		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d*%d=%d\n", i, j, i*j);
			}
			System.out.println();
		}
*/
		
		int [][] arrIncome = new int[2][3];
		int []arASum = new int[2];
		int []arBSum = new int[3];
		int sum = 0;
		double [] aAvg = new double[2];
		double [] bAvg = new double[3];
		double avg = 0.0;
		
		int rLength = arrIncome.length;
		int cLength = arrIncome[0].length;
		
		String result = "--------------------------------------\n";
		String [][] arrName = {
				{"������A", "ȫ����A", "������A"},
				{"������K", "ȫ����K", "������K"}
		};
		
		String [] arAName = {"����", "Ű��"};
		String [] arBName = {"������", "ȫ����", "������"};
		
		String inputMsg = "������� �Է��ϼ���";
		
		for(int i=0; i<rLength; i++) {
			for(int j=0; j<cLength; j++) {
				arrIncome[i][j] = Integer.parseInt(JOptionPane.showInputDialog(arrName[i][j] + "" + inputMsg));	
				
				arASum[i] += arrIncome[i][j];
				arBSum[j] += arrIncome[i][j];
				sum += arrIncome[i][j];
			}
		}
		for (int i=0; i<aAvg.length; i++) {
		aAvg[i] = Double.parseDouble(String.format("%.2f", (double)arASum[i] / arBSum.length));
		}
		for (int i=0; i<bAvg.length; i++) {
		bAvg[i] = Double.parseDouble(String.format("%.2f", (double)arBSum[i] / arASum.length));
		}
		
		avg = Double.parseDouble(String.format("%.2f", (double) sum / (rLength * cLength)));
		
		for(int i=0; i < rLength; i++) {
			for(int j=0; j < cLength; j++) {
				result += arrName[i][j] + "����� : " + arrIncome[i][j] + "����\n";
			}
			//���ɺ� �����
			result += arAName[i] + "�� ����� : " + arASum[i] + "����\n";
			result += arAName[i] + "��� ����� : " + aAvg[i] + "����\n";
			result += "--------------------------------------\n";
		}
		
		for(int i=0; i<arBSum.length; i++) {
			result += arBName[i] + "�� ����� : " + arBSum[i] + "����\n";
			result += arBName[i] + "��� ����� : " + bAvg[i] + "����\n";
		}
		
		result += "--------------------------------------\n";
		
		result += "�� ����� : " + sum + "����\n";
		result += "���� ����� : " + avg + "����\n";
		
		result += "--------------------------------------\n";
		
		JOptionPane.showMessageDialog(null, result);
	}
}