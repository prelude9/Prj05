package ex04;
/*
이름     :원이 리브 미나미 메이 제나
출생연도 :2004 2006 2006 2008 2008
담당     :리더 보컬 보컬 랩 보컬
 */

import java.time.LocalDateTime;

class GirlMember { //class 뒤의 이름은 달라야 함! 
	// field <1>
	private String name ;
	private int    bYear;
	private String role ;
	
	// conctructor <3>
	public GirlMember(String name, int bYear, String role) {
		this.name = name;
		this.bYear = bYear;
		this.role = role;
	}
	
	
	// method
	public void info() {// <2>인포는 메서드라서 중괄호가 필요하다, return을 안 쓸꺼면 void
		int age = LocalDateTime.now().getYear() - this.bYear; //this 붙여도 되고 안 붙여도 되고
		System.out.printf("%S   %d년생(%d살)  %s\n",
				          name,  bYear, age,  role);     

	}
}

public class MemberTest { // <4> package가 다르면 클래스 이름이 같아도 괜찮! 
	public static void main(String[] args) {
		GirlMember resc1 = new GirlMember("원이", 2004, "리더");
		resc1.info(); 
		GirlMember resc2 = new GirlMember("리브", 2006, "보컬");
		resc2.info();
		GirlMember resc3 = new GirlMember("미나미", 2006, "보컬");
		resc3.info(); 
		GirlMember resc4 = new GirlMember("메이", 2008, "랩");
		resc4.info(); 
		GirlMember resc5 = new GirlMember("제나", 2008, "보컬");
		resc5.info(); 
		sysout		rescArr[].info("");
	// GirlMember 내 여러개의 변수는 하나의 변수로 만들수 있다. >> 배열로 처리 가능 
    /* 1. 먼저 저장할 배열을 인원수에 맞게 준비 
		GirlMember [] rescArr = new GirlMember[5]; // [] 안에 5가 있어야 하나? 응! 
		rescArr[0] = new GirlMember("원이", 2004, "리더"); // == resc1  : 한칸과 같다 
		rescArr[1] = new GirlMember("리브", 2006, "보컬");
		rescArr[2] = new GirlMember("미나미", 2006, "보컬");
		rescArr[3] = new GirlMember("메이", 2008, "랩");
		rescArr[4] = new GirlMember("제나", 2008, "보컬"); // 이까지만 하면 출력 안됨~ 
		
		rescArr[0].info();
		rescArr[1].info();
		rescArr[2].info();
		rescArr[3].info();
		rescArr[4].info();
	*/
		int i=0;
		for(i=0 ; i<rescArr.length; 1++) {
			rescArr[i].info();			
		}
	}  
}
