package pathfinding;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Map extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Node rootNode;
	ArrayList<Node> nodes = new ArrayList<>(100);
	public final Dimension size = new Dimension(400, 500);
	private BufferedImage image = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);       

        // Draw Text
        g.drawString("This is my custom Panel!",10,20);
    }
	
	public Map() {
		setBorder(BorderFactory.createLineBorder(Color.black));
		setPreferredSize(size);
		generateMap();
	}
	
	private void generateMap() {

		
	}
	
	private void paintMap() {
		
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Scene Graph");
		Map map = new Map();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,250);
		frame.getContentPane().add(map, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
}
