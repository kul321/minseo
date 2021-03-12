package java04_control.loop;

public class For_07 {
//	첫날에 10원을 예금하고,
//	다음날에는 전날의 2배를
//  예금하는 방식으로
//  보름(15일) 동안 저축한 금액은? ->32760
	
	public static void main(String[] args) {
		
		//1. 		15일 동안 반복
		//2.
		//	반복횟수: 15번
		//	반복구간: 0~14까지
		
		//	초기식:	int i=0;	(시작값)
		//	조건식:	i<15;			(끝값)
		//	증감식:	i++
		
		//3.	반복코드로 수행해야 할 작업
		//		매일 수행해야 할 작업
		//      -> 예금액을 두 배로 만들기
		//      -> 예금액을 총 금액에 더하기
		
		//----------------------------------------
		int money = 10; //예금액
		int account = 0; //총 금액
		int i = 0;
		for(i = 0; i<15; i++) {//i, 0~14, x15
		
			// 총 금액에 예금액을 더하기
			account += money;
			// 예금액 두배로 만들기
			money *= 2;
	// account += money * (int)Math.pow(2,i); //money * 2^1
		}
		System.out.println(i +"일 동안 저축한 총 금액: "+account+"원");
				
	}
	
	
}
