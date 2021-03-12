package java01_variables;

public class VariablesQuiz {
	public static void main(String[] args) {
		//QUIZ 변수에 알맞은 타입을 골라 QUIZ
		//QUIZ 선언하고					 QUIZ	
		//QUIZ 대입한 후				 QUIZ
		//QUIZ 모든 데이터를 출력해보자	 QUIZ
		
		
		//-----------------------------------
		//int형		-정수,소수점 이하 없는 숫자
		//double형	-실수, 소수점 이하 있는 숫자
		//char형	-단일 문자
		//boolean형	-논리
		//String형	-문자열
		String myname; //이름에 대한 변수 선언
	
		myname = "강민서";//이름변수에 값 대입
			
		int age;//나이에 대한 변수 선언
		
		age = 32;//나이변수에 값 대입
				
		char gender;//성별에 대한 변수 선언
		
		gender = '여';//성별변수에 값 대입
		
		double height;//키에 대한 변수 선언
		
		height = 154.0;//키변수에 값 대입
		
		System.out.println("이름 : " + myname); //출력 이름
		System.out.println("나이 : " + age + "세");	//출력 나이
		System.out.println("성별 : " + gender); //출력 성별
		System.out.println("키 : " + height + "cm");	//출력 키
			
	}
}
