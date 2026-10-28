package ex10;

// interface 변수는 대체로 형용사를 준다. 또는 앞에 I 붙임. 그냥 참고~! 
interface IDuck {
	void swim();
}
interface IRacoon {
	void dig();
}

class DuckRacoon implements IDuck, IRacoon {

	@Override
	public void dig() {
		System.out.println("땅을 팝니다");
	}

	@Override
	public void swim() {
		System.out.println("수영을 합니다");	
	} 	
}

public class TestDuckRacoon {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();
	}

}
