package compareTo;

public class CompareTo {

	public static void main(String[] args) {
		//this is a comments
		Rectangle rectangle1 = new Rectangle(15, 15);
		Rectangle rectangle2 = new Rectangle(15, 15);
		int result = rectangle1.compareTo(rectangle2);
		
		if(result < 0) {
			System.out.println("answer: \n" + " Are not Equal but the first element is less");
		} else if(result > 0) {
			System.out.println("answer: \n" + " Are not Equal but the first element is greater");
		}else {
			System.out.println("answer: \n" + " Are Equals");
		}
	}

}
