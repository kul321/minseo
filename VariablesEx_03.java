package java01_variables;//패키지 선언

public class VariablesEx_03 {//클래스 정의
	public static void main(String[] args) {//메인 메소드
		
		int num;
		//쓰레기값이 들어가있는 상태가 된다
		
		num = 10;
		
		System.out.println(num);
	
		//--------------------------------------
		
		int num2 = 123; //선언과 동시에 초기화
		//쓰레기값이 들어가지 않고 곧바로 초기화된다
				
		System.out.println(num2);	
		
	}//main()
}//VariablesEx_03 end
