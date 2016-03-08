package workWithGraphic;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MainClass{
	
	 static JFrame frame;
	
	public static void main(String args[]){
		frame = new JFrame("MyFirstJPanal");
		MyFirstJPanal jp = new MyFirstJPanal();
		frame.add(BorderLayout.CENTER,jp);
		Button button = new Button("Click me!");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				frame.repaint();
			}
		});
		frame.add(BorderLayout.SOUTH, button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 300);
		frame.setVisible(true);
	}
	
}
