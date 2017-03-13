package point;

public class PointMain {

		public static void main(String[] args) {

			Point p1 = new Point(81,21);
			Point p2 = new Point(-52,32);
			Point p3 = new Point(-93,-13);
			Point p4 = new Point(64,-44);
			Point p0 = new Point(0,0);

			System.out.println("p1" + p1 + " quadrant=" + p1.quadrant());
			System.out.println("p2" + p2 + " quadrant=" + p2.quadrant());
			System.out.println("p3" + p3 + " quadrant=" + p3.quadrant());
			System.out.println("p4" + p4 + " quadrant=" + p4.quadrant());
			System.out.println("p0" + p0 + " quadrant=" + p0.quadrant());
	
			p1.flip();
			System.out.println("p1 after flip = " + p1);
			p2.flip();
			System.out.println("p2 after flip = " + p2);
			p3.flip();
			System.out.println("p3 after flip = " + p3);
			p4.flip();
			System.out.println("p4 after flip = " + p4);
			p0.flip();
			System.out.println("p0 after flip = " + p0);
			
			
			System.out.println("The midpoint between " + p1 + " and " + p2 + " is " + p1.midpoint(p2));
			
		}
}
