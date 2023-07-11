
public class Exercise05 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*5000 + 100);
		System.out.println(num);
		
//		num = num - num%100;
		num = num/100*100;
		
		System.out.println(num);

	}

}
