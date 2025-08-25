//Write a java program to show single inherticance where a class animal has a method eat() and a class dog inheritance from it method bark()

class Animal {
	void eat() {
		System.out.println("Animal is eating.");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog is barking.");
	}
}

public class Question1 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat(); 
		d.bark(); 
	}
}