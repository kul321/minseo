//패키지 선언 - 소스코드가 포함된 패지키를 나타낸다
package java01_variables;

//클래스 정의 - 프로그램의 기본 구성요소 (객체지향에서 자세히 다룸)
public class VariablesEx_01 {

	//메인 메소드 - 프로그램의 시작점
	public static void main(String[] args) {
		
		System.out.println( 123 );		//정수형 - int, 메모리 4byte 공간 사용
		System.out.println( 3.14 );		//실수형 - double, 메모리 8byte 공간 사용
		System.out.println( 'Q' );		//단일문자형 - char, 메모리 2byte 공간 사용
		
		System.out.println( "반가워요!");		//문자열(String타입) - 참조형
		System.out.println( "B" );				//문자열(String타입)
		
		System.out.println( true );		//논리형 - boolean, 메모리 1byte 공간 사용
	
	}//메인 메소드 정의 끝 - 프로그램의 중단점
	
}//클래스 정의 끝
