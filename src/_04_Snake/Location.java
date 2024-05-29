package _04_Snake;

public class Location {
	private int x;
	private int y;
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals (Location loc) {
		if(loc.x == this.x && loc.y == this.y) {
			return true;	
		}
		return false;
	}
}
