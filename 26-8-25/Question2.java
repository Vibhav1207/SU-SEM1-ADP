//Write a Java program with a parent class Animal having a method sound() that prints "Animal makes a sound". Create a child class Dog that overrides the sound() method to print "Dog barks". In the main method, create objects of both Animal and Dog classes and call the sound() method for both.

class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound();

        Animal myDog = new Dog();
        myDog.sound();

    }
}
