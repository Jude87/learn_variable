package example.variable;

import java.util.Scanner;

public class Variable {
	public void initVariable() {
		//변수 선언과 동시에 초기화
		
		//자료형 변수명; 으로 선언한다
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
	public void testFinal() {
		// *상수란?
		// 수학에서는 변하지 않는 값 의미, 컴퓨터(Java)에서는 한 번만 저장(기록)할 수 있는 메모리를 의미
		// 상수 선언 방법
		// final int AGE;
		// 상수 초기화 방법
		// 1) 선언과 동시에 초기화 final int NUM = 100;
		// 2) 선언 후 초기화 final int NUM; NUM = 100;
		// 초기화 이후 다른 데이터(값)을 대입할 수 없으며 상수명은 관례적으로 대문자로 표기
		
		int size; // 변수
		final int SIZE; // 상수
		
		size = 10;
		SIZE = 10;
		
		System.out.println("=== 값 변경 전 ===");
		System.out.println("size : " + size);
		System.out.println("SIZE : " + SIZE);
		
		//변수의 값 변경
		size = 20;
		//SIZE = 20; 상수는 초기화 이후 다른 데이터 대입 불가
		
		System.out.println("=== 값 변경 후 ===");
		System.out.println("size : " + size);
		System.out.println("SIZE : " + SIZE);
	}
		
		// 형변환(casting)
		// 값(Data)의 자료형을 바꾸는 것 (boolean 제외)
		// 컴퓨터의 값 처리 원칙으로는
		// 같은 종류 자료형만 대입 가능, 같은 종류 자료형만 계산 가능, 계산 결과 또한 같은 종류의 값이 나와야 함
		
		// 자동 형변환
		// 컴파일러가 자동으로 값의 범위가 작은 자료형을 값의 범위가 큰 자료형으로 변환
		// 단, byte와 short 자료형 값의 계산 결과는 무조건 int로 처리함
	
		// 강제 형변환
		// 값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로 변환
		// 강제 형변환 시 데이터 손실이 발생할 수 있음 -> 데이터의 변형, 손실을 감수하고 강제 변환
		// ex) double temp;
		//     int name = (int)temp; / 자료형을 명시하여 명시적 형변환이라고도 함
			
	public void testOverflow() {
		// 데이터 오버플로우 테스트
		System.out.println("byte의 최대값 : " + Byte.MAX_VALUE);
		System.out.println("byte의 최대값 : " + Byte.MIN_VALUE);
		
		//byte bnum = 128; //저장 가능 범위를 벗어나므로 에러 발생
		
		byte bnum = 127;
		bnum += 1; // bnum + 1 = bnum 과 같다
		System.out.println("byte의 최대값 +1 : " + bnum);
		
		bnum = -128;
		bnum -= 1; // bnum - 1 = bnum 과 같다
		System.out.println("byte의 최대값 -1 : " + bnum);
		
		int num1 = 100000;
		int num2 = 30000;
		
		// int의 저장 가능 범위는 약 21억이므로 30억이라는 값을 대입하면 오버플로우 발생
		//int result = num1*num2;
		
		// long의 저장 가능 범위는 int보다 높기 때문에 강제 형변환으로 데이터 손실없이 출력 가능
		long result = (long)num1*num2;
		System.out.println("계산 결과 : " + result);
	}
	public void testCasting() {
		// 형변환 테스트
		boolean bool = true;
		//bool = 1; // boolean은 형변환 불가
		
		//char -> int
		int num = 'A'; // int에 문자값을 대입하면 유니코드 숫자로 전환
		System.out.println("num : " + num);
		
		// char에 정수값 저장 가능 (숫자에 해당하는 유니코드 문자로 전환)
		char ch = 66;
		System.out.println("ch : " + ch);
		//ch = -66; // 음수는 대입 불가능

		//int -> char (정수값이 유니코드 문자로 전환)
		char ch2 = (char)num;
		System.out.println("ch2 : " + ch2);
	}
	public void testCasting2() {
		//int와 long의 연산
		int inum = 4;
		long lnum = 8L;
		
		//1. int 결과
		int isum = (int)(inum + lnum); // 두가지 변수를 묶어 int로 강제 형 변환하거나
		isum = inum + (int)lnum;       // long형만 int로 강제 형 변환하는 것도 가능
		System.out.println("isum : " + isum);
		
		//2. long 결과
		long lsum = inum + lnum; // long형이 표현가능한 수가 더 많기 때문에 문제없이 형변환
		System.out.println("lsum : " + lsum);
		
		//byte, short의 연산 결과 : int
		byte bnum = 1;
		short snum = 2;
		
		int sum1 = bnum + snum; // int형의 표현가능한 수가 더 많기 때문에 문제없이 형변환
		System.out.println("sum1 : " + sum1);
		
		//byte or short의 결과를 얻기 위해 강제 형변환
		short sum2 = (short)(bnum + snum);
		System.out.println("sum2 : " + sum2);
	}
	public void testDataLoss() {
		// 데이터 손실 테스트
		
		// 정수 -> 실수 : 자동 형변환
		long lnum = 100;   // 실수형 float가 4byte로 용량은 적게 차지하지만
		float fnum = lnum; // 표현 가능 수가 더 많기 때문에 문제없이 형변환
		System.out.println("lnum : " + lnum);
		
		// 실수 -> 정수 : 강제 형변환
		// 소수점 이하를 절삭하기 때문에 데이터 손실이 일어남
		double dnum = 10.5;
		int inum = (int)dnum;
		System.out.println("dnum : " + inum);
		
		//int형에서 byte형으로 강제 형변환하여 예상치 못한 데이터 손실 발생이 생김
		int num = 290;
		System.out.println("num : " + num);
		
		byte bnum = (byte)num;
		System.out.println("bnum : " + bnum);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
