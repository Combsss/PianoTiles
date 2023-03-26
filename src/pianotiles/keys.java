package pianotiles;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;

//Class for keys
//This class controls key movement and stores key position
public class keys extends JPanel{
	public static BufferedImage key;
	
	
	public void make_key(int x, int y, Graphics g) {
	
		try {
			key = ImageIO.read(new File("keys.jpg"));
			super.paintComponent(g);
			//Rotation not added yet?
			g.drawImage(key, x, y, null);
			
		}catch (Exception e) {
			System.out.println("Image does not exist!");
		}

		
	}
	
}//Wut??