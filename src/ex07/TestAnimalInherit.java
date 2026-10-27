package ex07;

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

public class TestAnimalInherit {

	public static void main(String[] args) { // 여기에 있는 메서드만 출력!!!  
		Dog chu  = new Dog(); 
		work(chu, "츄");  		
//		chu.name = "츄";
//		chu.eat();
//		chu.bark();
		
		System.out.println("");
		
		Cat nero = new Cat();
		work(nero, "네로");
		
//		nero.name = "네로";
//		nero.eat();
//		nero.meow();
		
		System.out.println("");
		
		Tiger neo = new Tiger();
	    work(neo, "네오");
//		neo.name = "네오";
//		neo.eat();
//		neo.cry();
		
	}
	//2. 동일한 부모 클래스를 상속한 경우 하나의 함수로 구현가능  > 추천하지는 않음
	private static void work(Animal animal, String name) { // 부모는 자식을 못 받지만 자식은 부모를 받을 수 있다
        animal.name = name;
		animal.eat();		
      //animal.bark(); > class Animal에는 바크가 없다 >> class 강제 변환 해줘야 함 
		if(animal instanceof Dog) // animal이 Dog 타입에서 호출된 것인가? 호출이 됐다면 뒤에 '.'을 붙이고 찾으면 됨	
		  ((Dog) animal).bark(); // () --> animal을 dog 타임으로 바꿔라 
		
		if(animal instanceof Cat)
		  ((Cat) animal).meow();
		
		if(animal instanceof Tiger)
		  ((Tiger) animal).cry();
		
	}
	
	
    /* 1. 메서드 오버로딩으로 처리 가능 (아래 방식)
       
	private static void work(Tiger neo, String string) {
		neo.name = "네오";
		neo.eat();
		neo.cry();
		
	}

	private static void work(Cat nero, String string) {
		nero.name = "네로";
		nero.eat();
		nero.meow();
		
	}

	private static void work(Dog chu, String string) {
        chu.name = "츄";
		chu.eat();
		chu.bark();
		
	} 
	*/


}