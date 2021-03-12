package java04_control.loop;

public class For_06 {
	//구구단 2단을 출력하기
	
	//추력 예시)
	//	2 x 1 = 2
	//	2 x 2 = 2
	//	2 x 3 = 6
	//	2 x 4 = 8
	//	2 x 5 = 10
	//	2 x 6 = 12
	//	2 x 7 = 14
	//	2 x 8 = 16
	//  2 x 9 = 18
	public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i<10; i++ ) {
			result = 2 * i;
			System.out.println("2 x "+ i +" = "+ result);
		}
		
	}
		
}
