package ex01;

// CRLF : 줄바꿈
// LF : line feed          \n         0x0a(10)
// CR : Carriage Return    \r         0x0d(13)
// unix, linux, android :  \n
// window               :  \r, \n
// mac                  :  \r 

public class TestCar01 {

	public static void main(String[] args) {
		// 변수를 계속 반복하는 작업을 하고 있음 >>> 이를 클래스로 만들어보자! 
		System.out.println("우리집 차량 보유현황");
		
		String  name1  = "아빠차";
		String color1  = "Blcak";
		int     year1  = 2023;          // 
		
		System.out.println("\n차이름: " + name1);
		System.out.println("색상: " + color1);
		System.out.println("연식: " + year1);
		
		
		String  name2  = "엄마차";
		String color2  = "Red";
		int     year2  = 2025;          // 
		
		System.out.println("\n차이름: " + name2);    // '\n' 을 적어주면 한줄 띄우게 됨. 앞에 적으면 문장 앞에, 뒤에 적으면 문장 뒤에 
		System.out.println("색상: " + color2);
		System.out.println("연식: " + year2 + "\n");
		
		String  name3  = "내차";
		String color3  = "Pink";
		int     year3  = 2025;          // 
		
		System.out.println("차이름: " + name3);
		System.out.println("색상: " + color3);
		System.out.println("연식: " + year3);

	}

}
