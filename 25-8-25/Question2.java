


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

class Puppy extends Dog {
	void pup() {
		System.out.println("Puppy is child of dog.");
	}
}

public class Question2 {
	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.eat();   
		p.bark();  
		p.pup();  
	}
}

