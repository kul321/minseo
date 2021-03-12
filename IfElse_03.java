package java04_control.condition;

public class IfElse_03 {
	public static void main (String[] args) {
		
		int num = 88;
		
		if ( num>0 && num<=100 ) {
			System.out.println("1~100 사이의 정수");
		}
		
		System.out.println("-------------------");
		
		
		// ** 들여쓰기 자동 정렬 단축키 ctrl + i
		//( 정렬할 코드들보다 전 후로 몇 줄 더 선택해서 실행한다)
		
		// ctrl +a 전체 코드 선택
		// ctrl +i 들여쓰기 정렬
		// ctrl + shift + f는 쓰지 말 것! 띄어쓰기까지 싹 다 정렬해버림
		if ( num>0 ) { //양수, positive number
			System.out.println("0보다 크다");
			
			if(num<=100) {
				System.out.println("0보다 크다");
				System.out.println("100보다 작거나 같다");
			}
		} else { //단순하게 반대 음수 아님! 양수가 아님, 0, 음수, num<=0
			 	System.out.println("0보다 크지 않다");
			 	
			 	
			if (num == 0) {
				System.out.println("0이다");
				
			} else {
				System.out.println("0이 아니다");
				System.out.println("0보다 작다");
				
			}
		}
		
	}

}
