package ex03;
/*
이름     :원이 리브 미나미 메이 제나
출생연도 :2004 2006 2006 2008 2008
담당     :리더 보컬 보컬 랩 보컬
 */

import java.time.LocalDate;

class GMember {  // 소문자 대문자 구분 잘할것 
	// 전역변수(feild는 무조건 private 붙여서 만든다)
	private String   name;
	private int     bYear;
	private String   role; 
	
	// 객체 지향 언어의 특징
	// 다형성: polymophism
	// 1. OverLoading: 같은 이름의 생성자(인자 개수가 다른)가 여러개 있다 
	// 생성자(Constructor): 객체를 new(생성)할 때 실행되는 명령 
	// 기본 생성자: 인자 없는 생성자. NoArgsConstructor 
	public GMember() { // class 붙이면 안 됨 >> 이 형태는 기본 생성자임 () 
		System.out.println("Hi 방가...");     // 변수를 중복이 안 되지만 함수는 인자와 변수가 다르면 쓸 수 있다
	}
	// 모든 인자가 있는 생성자, AllArgsConstructor 
	public GMember(String name, int bYear, String role) {
		this.name  = name; //this를 붙이면 전역변수의 name을 의미한다, 필드변수와 지역변수를 구별하기 위해
		this.bYear = bYear;
		this.role  = role;
	}
	
	// 메소드 : public
	public void info() {
		int age = LocalDate.now().getYear() - bYear;
		System.out.printf("%s    %d년(%d세)    %s\n ",
          				  name , bYear, age, role);
	}
}
public class MemberTest {
    // 모두 대문자: ctrl + shift + x
	// 모두 소문자: ctrl + shift + y
	
	
	// null : 변수를 만들었으나 사용한 적이 없음 
	public static void main(String[] args) {
		
		/*  null 개념 이해하기
		GMember r = new GMember();
		r.name    = "원이";
		r.info();   // 3칸인데 1칸만 썼음. "원이, 0, null" 숫자는 초기값, 문자열을 null로 표시

		GMember r2 = null;
		System.out.println(r2);

		r1.name = "원이";  >> 오류 발생  
		오류: 'The field GMember.name is not visible'
		오류 원인: private 변수를 .으로 직접 사용 했기 때문 
		오류 해결: private 변수의 값을 넣으려면 2가지 */
		//  1. 생성자를 이용
		GMember r1 = new GMember("원이", 2004, "리더");
		r1.info();
		
		GMember r2 = new GMember("리브", 2006, "보컬");
		r2.info();
		
		GMember r3 = new GMember("미나미", 2006, "보컬");
		r3.info();
		
		GMember r4 = new GMember("메이", 2008, "랩");
		r4.info();
		
		GMember r5 = new GMember("제나", 2009, "보컬");
		r5.info();
		// 2. Getter / Setter를 사용 
		
	}
}
