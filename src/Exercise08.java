
public class Exercise08 {

	public static void main(String[] args) {
		double x = 5;
		double y = 2;
		
		double z = x % y;
		
		if (Double.isNaN(z)) {
			System.out.println("0으로 나눌수 없습니다.");
		} else {
			z = z + 10;
			System.out.println(z);
		}
		
	}

}
