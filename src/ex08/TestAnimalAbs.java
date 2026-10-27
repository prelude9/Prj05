package ex08;
// abstract(추상) class를 이용한 다형성구현 방법2
// overlaod와 override의 차이점은 무엇인가! 
 abstract class Animal {
	String name;
	void eat(String food) {
		System.out.println(name + "(이)가 " + food + "을(를) 먹는다");
	}
	 abstract void sound(); // 하지만 코딩은 자식에게 맡기겠어. 다 다르니까. 
	                        // {} 없다는 것은 코딩을 하지 않겠다는 뜻임
	                        // abstract로 하겠어. 위에 'abstract class ___' 생성
	                        // 추상 메서드라고 명명함 
}
class Dog extends Animal {
	@Override  //add unimplemented method, 재정의. abstract 메소드를 자식이 다시 작성한다
	void sound() {
		System.out.println(name + "(이)가 멍멍");		
	}

}
class Cat extends Animal { // Cat에 오류나는 이유 ->override 하시오 

	@Override
	void sound() {
		System.out.println(name + "(이)가 야옹");
		
	} 
}

class Tiger extends Animal {

	@Override
	void sound() {
		System.out.println(name + "(이)가 어흥");
		
	}
	
}
public class TestAnimalAbs {

	public static void main(String[] args) {
		// Animal ani = new Animal(); --> abstract class는 불가능함. 코딩이 없으므로 
        Dog chu = new Dog();
        work(chu, "츄", "개껌");
        
        Cat nero = new Cat();
        work(nero, "네로", "츄르");
        
        Tiger neo = new Tiger();
        work(neo, "네오", "쑥");  //출력이 되는 지점은 main, 형태는 위의 class의 sysout을 따름 
	}

	private static void work(Animal animal, String name, String food) {
		animal.name = "name";
		animal.eat(food);
		animal.sound();
		
	}

}
