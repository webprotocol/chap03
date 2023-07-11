
public class BitLogicalExample {

	public static void main(String[] args) {
		int num1 = 0b1111_1000;
		int num2 = 0b0001_1111;
		
		/*
		 *   11111000
		 * & 00011111
		 * ============
		 *   00011000
		 */
		int result1 = num1 & num2;	// 24
		/*
		 *   11111000
		 * | 00011111
		 * ============
		 *   11111111
		 */
		int result2 = num1 | num2; // 255
		/*
		 *   11111000
		 * ^ 00011111
		 * ============
		 *   11100111
		 */
		
		int result3 = num1 ^ num2; // 231
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		

	}

}
