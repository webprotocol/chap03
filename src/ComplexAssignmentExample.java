
public class ComplexAssignmentExample {

	public static void main(String[] args) {
		int num = 100;
		
		num = num + 10;
		num += 10;
		
		System.out.println(num); // 120
		
		int num2 = 100;
		
		num2 *= 2 + 3;	// 500
	
		System.out.println(num2);
		System.out.println("[[[[[[/*[[[[[[[[[[*/[[[[[[{{{{{{");
		
		int num3;
		
//		num3 = num3 + 1; // (X)
//		num3++;
		num3 = 023;
		System.out.println(num3);
		
		long num4 = 3000L*3000*3000;
		
		System.out.println(num4);
		System.out.println(Integer.MAX_VALUE);
	}

}
