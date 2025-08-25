//Write a java program to demonstrate hiarcical inheritance where both the dog and cat classes inherites from the base class animal.

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

class Cat extends Animal {
	void meow() {
		System.out.println("Cat is meowing.");
	}
}

public class Question3 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();

		Cat c = new Cat();
		c.eat();
		c.meow();
	}
}

