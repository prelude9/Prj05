package ex11;
// 인터페이스의 특징: 규칙성을 부여하여 통일성을 준다
// 서로 협업을 할 때, 코딩에 규칙성을 부여할 수 있다. 

interface Ipo {
	void input ();
	void process ();
	void output();
}

class Job implements Ipo {

	@Override
	public void input() {
		System.out.println("input");
	}

	@Override
	public void process() {
		System.out.println("process");
	}

	@Override
	public void output() {
		System.out.println("output");		
	}
	
}

public class TestInterface {

	public static void main(String[] args) {
		Job job1 = new Job();
		job1.input();
		job1.process();
		job1.output();
	}

}
