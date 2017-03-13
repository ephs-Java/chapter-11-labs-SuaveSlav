package point;

public class Point {
	
	private int x;
	private int y;

		
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(x=" + this.x + ",y=" + this.y + ")";
	}
	
	public int quadrant() {
		if (this.x > 0 && this.y > 0) {
			return 1;
		} else if (this.x > 0 && this.y < 0) {
			return 4;
		} else if (this.x < 0 && this.y < 0) {
			return 3;
		} else if (this.x < 0 && this.y > 0) {
			return 2;
		} else {
			return 0;
		}
	}
		

		public void flip() {
			int temp = this.x;
			this.x = (this.y * -1);
			this.y = (temp * -1);
		}

		public String midpoint(Point p2) {
			return "(" + ((this.x + p2.x) / 2) + "," + ((this.y + p2.y)/2)+")";
		}

}
