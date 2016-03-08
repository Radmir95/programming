package workWithGraphic;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyFirstJPanal extends JPanel{
	public void paintComponent(Graphics g){
		
		// Draw simple orange rectangle
		/*g.setColor(Color.orange);
		g.fillRect(20, 50, 100, 100);*/
		
		// Draw simple image using absolute path
		/*Image image = new ImageIcon("C:/Users/Radmir/Desktop/Golden_Retriever.jpg").getImage();
		g.drawImage(image, 3, 4, this);*/
		
		// Black rectangle with orange oval
		/*g.fillRect(0, 0, this.getWidth(), this.getHeight());
		int red = (int)(Math.random() * 255);
		int green = (int)(Math.random() * 255);
		int blue = (int)(Math.random() * 255);
		Color clr = new Color(red, green, blue);
		g.setColor(clr);
		g.fillOval(70, 70, 100, 100);*/
		
		// Two intersected figures and copy at another place
		/*g.setColor(Color.orange);
		g.fillOval(3, 3, 50, 50);
		g.setColor(Color.green);
		g.fillRect(20, 20, 50, 50);
		g.copyArea(3, 3, 30, 30, 90, 90);*/
		
		// Two intersected figures and erase intersect area
		/*g.setColor(Color.orange);
		g.fillOval(3, 3, 50, 50);
		g.setColor(Color.green);
		g.fillRect(20, 20, 50, 50);
		g.clearRect(15, 15, 30, 30);*/
		
		// 3d figures in or out raised
		/*g.setColor(Color.CYAN);
		g.fill3DRect(0, 0, 150, 150, true);
		g.setColor(Color.BLUE);
		g.fill3DRect(0, 0, 50, 50, true);
		g.fill3DRect(100, 0, 50, 50, true);*/
		
		// Using gradient
		/*
		Graphics2D g2d = (Graphics2D) g;
		GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);
		g2d.setPaint(gradient);
		g2d.fillOval(30, 30, 100, 100);
		*/
		
		// Draw random gradient oval
		Graphics2D g2d = (Graphics2D) g;
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		Color clr = new Color(red, green, blue);
		red = (int) (Math.random() * 255);
		green = (int) (Math.random() * 255);
		blue = (int) (Math.random() * 255);
		Color end = new Color(red, green, blue); 
		GradientPaint gradient = new GradientPaint(70, 70, clr, 150, 150, end);
		g2d.setPaint(gradient);
		g.fillOval(3, 3, 100, 100);
		
		
	}
}
