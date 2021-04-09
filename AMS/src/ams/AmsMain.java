package ams;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AmsMain {

	public static void main(String[] args) {
		
		AmsField af = new AmsField();
		ImageIcon img = new ImageIcon("src/img/airplane.png");
		String [] arPlane = new String[5];
		String keyword = "";
		//절대 경로 : 내 위치가 어디든지 찾아갈 수 있는 경로
		//상대 경로 : 내 위치에 따라서 변경되는 경로

		String [] menu = {"추가하기", "검색하기", "수정하기", "삭제하기", "목록보기"};
		String [] searchMenu = {"항공사", "항공기 번호", "최대 승객수", "출발지", "도착지"};
		String [] updateMenu = {"출발지 수정", "도착지 수정"};
		
		int index = 0;
		int choice = 0;
		
		String insertMsg = "[추가하실 정보를 그대로 입력하세요(, 포함)]\n" + "항공사, 항공기번호, 최대승객수, 출발지, 도착지";
		String searchMsg = "검색하실 항공사를 입력하세요\n";
		String deleteMsg = "삭제하실 항공기 번호를 입력하세요\n";
		String UpdateMsg = "수정하실 항공기 번호를 입력하세요\n";
		
		while(true) {
			choice = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, img, menu, null);
		
			if (choice == -1) break;
			
			switch(choice) {
			//추가하기 영역
			case 0:
				arPlane = JOptionPane.showInputDialog(insertMsg).split(", ");
				af.insert(arPlane);
				break;
			//검색하기 영역
			case 1:
				index = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION,
						JOptionPane.PLAIN_MESSAGE, img, searchMenu, null);
				if(index != -1) {
				keyword = JOptionPane.showInputDialog("검색하실" + searchMenu[index] + "을(를) 입력하세요");
				JOptionPane.showMessageDialog(null, af.search(keyword, index));
				}
				break;
				
			//수정하기 영역
			//출발지, 목적지
			//항공기 번호가 존재할때
			//JOptionPane.ShowOptionDialog() 사용하기
			//출발지 수정, 목적지 수정
			//항공기 번호를 입력받고 해당 항공기의 출발지와 목적지를 수정
			//출발지와 목적지가 동일하면 수정 실패
			
			case 2:
				String planeNum = JOptionPane.showInputDialog(UpdateMsg);
				String temp = af.search(planeNum, 1);
				
				if(temp.equals("검색 결과 없음")) {
					JOptionPane.showMessageDialog(null, "수정 실패");
				}else {
					index = JOptionPane.showOptionDialog(null, "", "AMS" , JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, img, updateMenu, null);
					String newValue = JOptionPane.showInputDialog("수정하실 " + updateMenu[index] + "를 입력하세요");
					af.update(planeNum, index, newValue);
				}
				break;
			//삭제하기 영역
			case 3:
				keyword = JOptionPane.showInputDialog(deleteMsg);
				if(af.delete(keyword)) {
					JOptionPane.showMessageDialog(null, "삭제 완료");
				} else {
					JOptionPane.showMessageDialog(null, "삭제 실패");
				}
				break;
			//목록보기 영역
			case 4:
				JOptionPane.showMessageDialog(null, af.show());
				break;
			}
		}
		System.out.println(choice);
	}

}
