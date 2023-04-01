package pianotiles;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

  

public class Main extends JPanel implements MouseListener{
	
	//Utility
	public static Graphics pencil;
	
	//Mouse pos
	public static int x, y;
	
	//Screen
	Dimension temp1 = Toolkit.getDefaultToolkit().getScreenSize();
	public int X = (int)temp1.getWidth(), Y = (int)temp1.getHeight();
	
	
	//Start button

	public static BufferedImage but;
	
	
	public Main() {
		//Window settings
		setPreferredSize(new Dimension(X, Y));
		setBackground(new Color(255, 255, 255));
		addMouseListener(this);
		
	}
	
	public void paint(Graphics pencil) {
		try {
			but = ImageIO.read(new File("startbutton.jpg"));
			super.paintComponent(pencil);
			pencil.drawImage(but, X/2-280, Y/2-180, null);
		}catch (Exception e) {
			System.out.println("FAIL");
		}
	}
	
	public static void main(String[] args) {
		
		//Window setup
		JFrame frame = new JFrame("YOU HAVE NO HANDS");
		Main window = new Main();
		
		frame.add(window);
		frame.pack();
		frame.setVisible(true);
		//
		Main phone = new Main();
		phone.startbutton(pencil);
		
		
	}
	
	
	public void rain() {
		
	}
	
	public void startbutton(Graphics pencil) {
	
		try {
			but = ImageIO.read(new File("startbutton.jpg"));
			super.paintComponent(pencil);
			pencil.drawImage(but, X/2-280, Y/2-180, null);
		}catch (Exception e) {
			System.out.println("FAIL");
		}
		
		
	}
	
	//MOUSE stuff

	public void mousePressed(MouseEvent e)
	{
		
		
		x = e.getX();
		y = e.getY();
		System.out.println(x);
		System.out.println(y);
		
	}
	public void mouseClicked(MouseEvent e)
	{	
	}
	public void mouseReleased(MouseEvent e)
	{
	}
	public void mouseExited(MouseEvent e)
	{
	}
	public void mouseEntered(MouseEvent e)
	{
	}
}







