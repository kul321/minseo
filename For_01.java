package java04_control.loop;

public class For_01 {
	public static void main(String[] args) {
		
		// 반복문, loop
		//	 for 문, while 문, do-while 문
		
		//for문, for loop
		
		//for( 초기식; 조건식; 증감식;) {
			
			//조건식이 true라면 수행하는 코드 영역
			//반복적으로 수행한다
			
		int i;
		for( i=0; i<5; i++ ) {
			System.out.println("Hi :" + i);
		}
		
		// 초기식: i=0
		// 조건식: i<5
		// 증감식: i++
		
		//i변수가 0부터 시작해서
		//i변수가 5보다 작은 동안에
		//1씩 증가시키면서 반복한다
		
		//---------------------------------------
		//for문의 수행 순서
		// 1. 초기식을 수행
		// 2. 조건식을 판별(true인지 false인지)
		//		2-1. true일 때, 3번 수행
		//		2-2. false일 때, for문 종료(반복문 중단)
		// 3. {}중괄호 안에 들어있는 코드를 수행
		// 4. 증감식을 수행
		// 5. 2번을 다시 수행
	}

}
