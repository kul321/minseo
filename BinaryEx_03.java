package java02_operator;

public class BinaryEx_03 {
	public static void main(String[] args) {
		
		//이항연산자 - 관계, 비교
		
		// < less than, lt
		// > greater than, gt
		// <= less than equal, le
		// >= greater than equal, ge
		// == equal, eq
		// != not equal, ne
		
		// 왼쪽 피연산자와 오른쪽 피연산자를 비교하여
		// 결과를 참/거짓으로 반환한다( boolean타입으로)
		
		// true / false 반환한다
		
		//--------------------------------------------------
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println( "num1==num2 : " + (num1==num2)); //false
		System.out.println( "num1!=num2 : " + (num1!=num2)); //true
		
		System.out.println( "num1<num2 : " + (num1<num2)); //true
		System.out.println( "num1>num2 : " + (num1>num2)); //false
		
		System.out.println( "num1<=num2 : " + (num1<=num2)); //true
		System.out.println( "num1>=num2 : " + (num1>=num2)); //false
		
		//------------------------------------------------------
		
		boolean result = num1 == num2;
		System.out.println("결과 : " + result);
		
		//이항연산자
		// &&		||		!
		//  AND     OR		NOT
		
		// ! 연산자는 단항 연산자
		// |, vertical bar, 수직 바 (shift + \)
		
		// 논리형 타입(boolean) 데이터의 관계를 따져서 결과를 내보내는 연산자
		
		// And 연산은 피연산자 모두 true 일 때 결과가 true
		// OR 연산은 피연산자 중 하나라도 true 일 때 결과가 true
		// NOT 연산은 피연산자를 부정(반대로 바꿈)
		
		//--------------------------------------------------
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("true&&false : " + (b1&&b2)); //false
		System.out.println("treu||false : " + (b1||b2)); //true
		//-----------------------------------------------------
		
		System.out.println("-----------------------");
		
		int num = 88;
		
		System.out.println(num >= 1 ); //true
		System.out.println(num <= 100 ); //true
		
		System.out.println(num >=1 && num <= 100);
		//-----------------------------------------------------
//		System.out.println( 1<= num < 100); 
		//에러 뜨며 안되는 이유: 불린 값과 인트 값을 비교 연산하는 것이
		//말이 안되기 때문
		
		//-------------------------------------------------
		
		System.out.println("!true : " + !true);
		System.out.println("false : " + !false);
		
		//---------------------------------------------------
		System.out.println("-----------------------");
		
		System.out.println( !( (num>=1) && (num<=100)  ) );
		
		System.out.println( num<1 || num>100);
		
	}

}
