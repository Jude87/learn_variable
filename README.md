# learn_variable

import java.util.Scanner;

public class Variable {
	public void initVariable() {
		//변수 선언과 동시에 초기화
		
		// 자료형 변수명; 으로 선언한다
		//논리형 : 1byte
		//2단어 이상의 변수명 : 낙타등 표기법
		boolean isTrue = true;
		boolean isFalse = false;
		
		//문자형 : 2byte
		char ch = 'a'; // '' 싱글 쿼테이션 사용
		//char ch2 = 'bc'; // 하나의 문자만 대입 가능
		
		//문자열 : 참조형 (메모리의 주소값에 저장되고 그 주소값을 불러오는 것)
		String str = "안녕하세요"; // "" 더블 쿼테이션 사용
		
		// 숫자 (기본적으로 정수형은 int / 실수형은 long을 가장 보편적으로 사용함)
		// 정수형
		byte bnum = 1; //1byte
		short snum = 2; // 2byte
		int inum = 4; // 4byte
		long lnum = 8L; // 8byte // long형을 사용할때는 꼭 정수 뒤에 대문자 L을 표기해야함
		
		// 실수형
		float fnum = 4.0f; // 4byte // float형을 사용할때는 꼭 실수 뒤에 소문자 f를 표기해야함
		double dnum = 8.0; // 8byte
		
		System.out.println("isTrue의 값 = " + isTrue);
		System.out.println("isFalse의 값 = " + isFalse);
		
		System.out.println("ch의 값 = " + ch);
		System.out.println("str의 값 = " + str);
		
		System.out.println("bnum의 값 = " + bnum);
		System.out.println("snum의 값 = " + snum);
		System.out.println("inum의 값 = " + inum);
		System.out.println("lnum의 값 = " + lnum);
		
		System.out.println("fnum의 값 = " + fnum);
		System.out.println("dnum의 값 = " + dnum);
	}
	public void changeValue() {
		//변수값 변경 테스트
		String name;
		char gender;
		int age;
		double height;
		
		name = "김영희";
		gender = 'F';
		age = 20;
		height = 171.5;
		
		System.out.println(name + "님의 개인정보");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height" + height);
		
		//키보드로 값을 입력받아 변수에 저장된 값 변경
		Scanner sc = new Scanner(System.in); // 키보드로 입력값을 받아오는 스캐너 메소드
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine(); // 문자열 데이터를 읽어오는 메소드 nextLine()
		System.out.println("성별을 입력하세요 : ");
		gender = sc.next().charAt(0); // 단일 문자를 읽어오는 메소드는 제공하지 않기 때문에 
									  // next().charAt(0); 으로 괄호안의 숫자의 순서에 해당하는 문자가 출력
		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt(); // 정수형을 읽어오는 메소드 nextInt
		System.out.println("키를 입력하세요 : ");
		height = sc.nextDouble(); // 실수형을 읽어오는 메소드 nextDouble
		
		System.out.println(name + "님의 개인정보");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		
		// *출력메소드
		// System.out.printf("%형식", 변수 등) f는 포멧의 f임
		// 정해져 있는 형식에 맞춰서 그 형식에 맞는 값(변수)를 줄바꿈 하지 않고 출력
		// %d : 정수형 / %o : 8진수 / %x : 16진수
		// %c : 문자 / %s : 문자열
		// %f : 실수(소수점 아래 6자리) / %e : 지수형태표현 / %g : 대입 값 그대로
		// %A : 16진수 실수
		// %b : 논리형
		
		// 정렬방법
		// %5d : 5칸을 확보하고 오른쪽 정렬
		// %-5d : 5칸을 확보하고 왼쪽 정렬
		// %.2f : 소수점 아래 2자리까지만 표시
		// \n : 역슬레시 n은 개행
	}
}
