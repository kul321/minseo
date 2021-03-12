package java02_operator;

public class BinaryEx_01 {
	public static void main(String[] args) {
		//이항연산자 - 산술
		// + - * / %(나머지)
		
		int num1 = 17, num2 = 4;
		
		int result; //결과 저장 변수
		
		result = num1 + num2;
		result = 17 + 4; //변수 활용
		result = 21; //덧셈 연산
		
		System.out.println("덧셈 결과 : " + result);
		System.out.println(num1 + "과 " + num2 + "의 합계 : " + result);
		
		System.out.println("-------------------");
	
		//%
		//	나머지 연산자
		// moular operator
		//	mod 연산자
		
		result = num1 % num2; //num1을 num2로 나눈 나머지
		//result = 17 % 4
	
		System.out.println("나머지 연산 결과 : " + result);
		
		//-----------------------------------------------
		
		System.out.println("--- 산술 연산자 ---");
		System.out.println("num1 + num2 = " + num1 + num2);//문자열 연결함
		
		System.out.println("num1 + num2 = " + (num1 + num2));//괄호 우선
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));//4.25가 아니라 4가 나옴
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		//산술연산은 반드시 피연산자들이 같은 데이터타입일 때 연산 가능하다
		//산술연산의 결과는 피연산자의 데이터타입으로 나온다
		
		System.out.println( "-------------------");
		System.out.println( 17 / 4); //int/int ->int로 나옴
		System.out.println( 17.0 / 4.0); //double/double -> double로 나옴
		System.out.println( (double)num1 / (double)num2); //형변환해주는 연산자 이용
		System.out.println( (double)17 / (double)4); //변수 활용
		System.out.println( 17.0 / 4.0 ); //형변환
		System.out.println( 4.25 ); //double / double 연산
		
		System.out.println("--------------------");
		
		double d = 3.14;
		System.out.println("d/2 - " + (d/2));
		System.out.println("d/2 - " + (d%2));
		
		
		
		
	
	}
}
