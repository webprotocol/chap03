
public class ArithmeticExample {

	public static void main(String[] args) {
		/*
		 * epoch time(unix time) : 1970/01/01 00:00:00 ~ 경과시간
		 * 
		 * GMT, UTC
		 */
		long current = System.currentTimeMillis()/1000; // 초로 변환
		
		int year = 0;
		int month = 0;
		int day = 0;
		int week = 0;
		
		long hour = current/60/60%24 + 9;
		long minute = current/60%60;
		long second = current%60;
		
		System.out.println(current);
		
		System.out.printf("%04d/%02d/%02d %d %02d:%02d:%02d\n",
										year, month, day, week,
										hour, minute, second);
	}

}
