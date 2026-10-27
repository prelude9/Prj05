package ex02;

// access modifier : 접근제한자
// private   : 해당 클래스에서만 사용가능 
// package   : 해당 패키지에서만 사용가능 (접근제한자를 생략하면)
// protected : package + protected (상속관계에서만 공유)
// public    : 모든 곳에서 사용가능, 다른 class에서도  가능  


// 우리가 표현하고자 하는 대상(객체)를 보여주는 설계도 
class Car { //클래스는 전역변수를 묶어 놓은 것 
	// Fields
	// 반복되는(공통) 변수 : name, color, year
	// 자바의 모든 필드 변수를 앞에 private을 붙여야 하는데 여기서는 그렇게 하지 않음
	String   name;
	String   color; //앞에 private이 없으면 해당 패키지 폴더안에서만 사용 가능
	int      year;
	
	// Methods  
	/*
	private void sysout() {
		// TODO Auto-generated method stub  >>  sysout이 먹히지 않음 	
	*/
	void info() {
		System.out.println("차이름: " + name );
		System.out.println("색상: " + color);
		System.out.println("연식: " + year + "\n");
	}
}

public class TestCar02 {	
	public static void main(String[] args) { // static: 정적-컴파일시, dynamic: 동적-실행시 
		Car car1   = new Car(); // 클래스를 사용하려면 앞에 new를 붙여야 함, 클래스는 대문자로 시작 
		car1.name  = "아빠차";  // private을 붙이면 the field Car.name is not visible 이라는 오류, Car안에 name이 보이지 않아!  
		car1.color = "Black";
		car1.year  = 2023;
		car1.info();
		
		Car car2   = new Car();  // localData로 쓰고 싶다면 static으로 만들어서 쓰면 됨 
		car2.name  = "엄마차";
		car2.color = "Red";
		car2.year  = 2025;
		car2.info();
	
		Car car3   = new Car();
		car3.name  = "내차";
		car3.color = "Pink";
		car3.year  = 2025;
		car3.info();
	}

}
