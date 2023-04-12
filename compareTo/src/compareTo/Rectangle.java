package compareTo;

public class Rectangle implements Comparable<Rectangle>{
	int width;
	int height;
	
	public Rectangle(int i, int j) {
		this.width = i ;
		this.height = j;
	}
	
	@Override
	public int compareTo(Rectangle other) {
		int thisArea = height * width;
		int otherAreas = other.height * other.width;
		return thisArea - otherAreas;
	}
	
	
}
