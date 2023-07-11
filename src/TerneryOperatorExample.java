
public class TerneryOperatorExample {

	public static void main2(String[] args) {
		double r1 = Math.random();	// [0. ~ 1)
		
		System.out.println(r1);
		System.out.println(r1*80);
		System.out.println((int)(r1*80));
	}
	
	public static void main(String[] args) {
		int num = (int)(Math.random()*100);	// [0~1)
		
		System.out.println(num%2==0 ? "짝수" : "홀수");
		System.out.println(num);
	}

}
