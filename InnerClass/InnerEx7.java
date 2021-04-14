package OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InnerEx7 {

	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println();
				
			}
			
		});

	}

}

class EventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
