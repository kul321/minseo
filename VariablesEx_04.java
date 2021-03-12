package java01_variables; //패키지 선언

public class VariablesEx_04 {//클래스 정의
	public static void main(String[] args) {//메인 메소드
	//변수 선언 - double형 height변수
	double height; //사람의 키
	
	//변수에 값 대입
	height = 200.5;
	
	//변수의 값 출력
	System.out.println( "height 변수의 값은 : " + height );
	
	// +  기호 : 문자열 연결 기능
	
	//------------------------------------------------------------
	
	double data;
	
	data = height + 100; //덧셈
	System.out.println("data : " + data);
	
	//-------------------------------------------------------------
	
	char alpha;
	//alpha = 'T'; // 84
	alpha = 86; // 'V'
	
	System.out.println(alpha);
	
	//-------------------------------------------------------------
	boolean isRight;
	//isRight = true; //참
	isRight = false; //거짓
	
	System.out.println( isRight );
	//boolean형 변수는 true/false 두 가지 값만 저장할 수 있다
	
	}//메인 end
}//클래스 end
