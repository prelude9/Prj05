package ex03;
/*
이름     :원이 리브 미나미 메이 제나
출생연도 :2004 2006 2006 2008 2008
담당     :리더 보컬 보컬 랩 보컬
 */

class GMember {  // 소문자 대문자 구분 잘할것 
	// 전역변수(feild : private으로 만든다)
	private String name;
	private int    bYear;
	private String role; 
	
	// 생성자: 객체를 new(생성)할 때 실행되는 명령 
	public GMember() { // class 붙이면 안 됨 
		System.out.println("Hi 방가...");     // 변수를 중복이 안 되지만 함수는 인자와 변수가 다르면 쓸 수 있다
	}
	public GMember(String n, int bY, String r) {
		name  = n; 
		bYear = bY;
		role  = r;
	}
	
	// 메소드 
	public void info() {
		System.out.printf("%s    %d    %s\n ",
          				  name , bYear, role);
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
		*/
		
		GMember r0 = new GMember();
		/*
		r1.name = "원이";  >> 오류 발생  
		오류: 'The field GMember.name is not visible'
		오류 원인: private 변수를 .으로 직접 사용 했기 때문 
		오류 해결: private 변수의 값을 넣으려면 2가지 
		  1. 생성자를 이용
		  2. Getter / Setter를 사용 
		 */
		GMember r1 = new GMember("원이", 2004, "리더");
		r1.info();
		
	
	}
}
