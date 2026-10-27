package ex06;

class Animal {
	String name;
	void eat() {
		System.out.println(name + "(이)가 먹는다");
	}
}

class Dog extends Animal { // 동일한 패키지 안에서는 'Dog'를 동일로 인식하므로 주의! 
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

	public static void main(String[] args) { // 여기에 출력 함수가 없으면 출력되는 것은 없다! 
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