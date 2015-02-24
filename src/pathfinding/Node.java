package pathfinding;

import java.util.ArrayList;

public class Node {
	Coord2 pos;
	ArrayList<Node> connections = new ArrayList<>(10);
	int connectionRadius = 40;
	double connectionChance = .5;
	
	public Node(Coord2 _pos) {
		pos = _pos;
	}
	
	
	
}
