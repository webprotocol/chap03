
public class IncrementDecrementExample {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
//		System.out.println(++num1);
//		System.out.println(num2++);
		
		int result1 = ++num1 * 1;	// 11
		int result2 = num2++ * 1;	// 10
		
	}
	
	public static void main3(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		int result1 = ++num1 + 10;	// 21
		int result2 = num2++ + 10;	// 20
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
		
		
	}

	public static void main2(String[] args) {
		int num = 10;
		++num;	// num = num + 1
		System.out.println(num);
		
		num++;	// num = num + 1
		System.out.println(num);
		

	}

}
