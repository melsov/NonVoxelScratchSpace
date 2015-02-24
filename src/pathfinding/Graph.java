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

public class Graph extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final Dimension size = new Dimension(800, 600);
	private BufferedImage image = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);       

        // Draw Text
        g.drawString("This is my custom Panel!",10,20);
    }
	
	public Graph() {
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
		Graph graph = new Graph();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(graph.size);
		frame.getContentPane().add(graph, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
}
