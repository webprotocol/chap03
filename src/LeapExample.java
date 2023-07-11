
public class LeapExample {
	
	public static void main(String[] args) {
		int year = (int)(Math.random()*5000 + 1);
		
		System.out.println(year);
		String leap = (year%4==0 && year%100!=0) || year%400==0 ? "윤년" : "평년";
		
		System.out.println(leap);

	}
	
	public static void main3(String[] args) {
		double oneYear = 365.2422;
		double tenYear = oneYear * 100;
		
		System.out.println(tenYear);
		
		System.out.println(366*25 + 365*75);
		
		
	}

	public static void main2(String[] args) {
		double oneYear = 365.2422;
		
		double fourYear = oneYear * 4;
		System.out.println(fourYear);
		
		System.out.println(365*4);

	}

}
