package java04_control.condition;

public class IfElseIfElse {
	public static void main(String[] args) {
		
		//if ~ else if ~ else
		
//		if( 조건식1 ) {
//			조건식1이 참일 때 수행하는 영역
//		} else if ( 조건식2 ) {
//			조건식1이 일단 거짓이고
//			조건식2가 참일 때 수행하는 영역
//		} else { 모두 거짓일 때 수행하는 영역
//		}
//			
//		}
		
		//**else 구문은 마지막에만 올 수 있다
		//**else, else if는 필수 아님(없어도 됨)
		//**if문 없이 else, else if만 사용할 수 없다
		
		//--------------------------------------------
		
		int num = 7;
		
		if ( num == 10 ) {
			System.out.println("10입니다");
			} else if ( num == 20 ) {
				System.out.println("20입니다");
			} else if ( num == 30 ) {
				System.out.println("30입니다");
			} else {
				System.out.println("모두 아닙니다");
			}
				
	}

}
