package ex09;

// class 다중 상속 : 클래스를 같이 받겠다는 의미, c++만 가능, Java와 c#에서는 안 됨
// Java에서는 interface를 이용하려 다중상속을 구현한다 
// 오리너구리 class : 오리 class + 너구리 class
class Duck {
	void swim()	{
		System.out.println("헤엄을 칩니다");
	}
}

interface Racoon {
	void dig();
}

//Java extends 뒤에는 한개의 class만 사용 가능 
class DuckRacoon extends Duck implements Racoon {

	@Override
	public void dig() {
		System.out.println("땅을 팝니다");
	}	
}

public class TestDuckRacoon {
	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon(); //DuckRacoon을 호출 
		dr.swim(); // extends Duck을 상속, dig을 하면 출력 안 됨
		dr.dig();		
	}
}
