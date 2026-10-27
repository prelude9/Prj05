package ex06;

class Animal {
	String name;
	void eat() {
		System.out.println(name + "(이)가 먹는다"); // 부모로 뽑음 
	}
}

// bark, meow, cry도 어떻게 보면 같은 소리를 내는 것인데 하나로 통일할 수 없을까?
// 하지만 이름은 같다 하더라도 기능(결과)가 달라짐 
// 한번 효율적으로 코딩해볼까?
// abstract, 인터페이스로 접근 가능, 인터페이스는 스프링을 할 때 매우 중요한 개념임 
class Dog extends Animal {  
	void bark() {
		System.out.println(name + "(이)가 멍멍");
	}
}

class Cat extends Animal{
	void meow() {
		System.out.println(name + "(이)가 야옹");
	}
}

class Tiger extends Animal{
	void cry( ) {
		System.out.println(name + "(이)가 어흥");
	}
}

public class TestAnimal {

	public static void main(String[] args) { // 여기에 있는 메서드만 출력!!!  
		Dog chu  = new Dog();
		chu.name = "츄";
		chu.eat();
		chu.bark();
		
		System.out.println("");
		
		Cat nero = new Cat();
		nero.name = "네로";
		nero.eat();
		nero.meow();
		
		System.out.println("");
		
		Tiger neo = new Tiger();
		neo.name = "네오";
		neo.eat();
		neo.cry();
		
	}
}