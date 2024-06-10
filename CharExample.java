//문자 리터럴을 유니코드로 저장할 수 있도록 char 타입 제공
//문자 리터럴: 하나의 문자를 작은 따옴표(‘)로 감싼 것
//char 타입은 문자 타입의 변수이지만 사실은 2바이트의 정수타입이다

package ch02.sec03;

public class CharExample {

	public static void main(String[] args) {
		char c1='A';//문자 지정
		char c2=40;//유니코드 번호
		
		char c3='B';//문자 지정
		char c4=44032;//유니코드
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
				
		
	}

}
