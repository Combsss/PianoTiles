package pianotiles;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;


public class Main extends JPanel implements MouseListener{
	
	public static int x, y;
	
	
	public Main() {
		//Window settings
		setPreferredSize(new Dimension(300, 300));
		setBackground(new Color(255, 255, 255));
		addMouseListener(this);
	}
	
	public static void main(String[] args) {
		
		//Window setup
		JFrame frame = new JFrame("YOU HAVE NO HANDS");
		Main window = new Main();
		
		frame.add(window);
		frame.pack();
		frame.setVisible(true);
		//
		
		
		
	}
	
	public void addkey(Graphics g) {
		super.paintComponent(g);
		keys hi = new keys();
		g.drawOval(x-40, y-40, 80, 80);
		hi.make_key(x, y, g);
		
	}
	
	//Extra

	public void mousePressed(MouseEvent e)
	{
		x = e.getX();
		y = e.getY();
		System.out.println(x);
		System.out.println(y);
		addkey(this.getGraphics());
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