class Dog {
    
    String name;

    
    public Dog(String name) {
        System.out.println("A new dog has been created!");
        this.name = name;
    }

   
    public void bark() {
        System.out.println(name + " says: Woof!");
    }
}


public class Question1 {

    
    public static void main(String[] args) {
        
        System.out.println("Creating a new Dog object...");

       
        Dog dog1 = new Dog("Buddy");

        
        dog1.bark();

        
        System.out.println("\nCreating another Dog object...");
        Dog dog2 = new Dog("Lucy");
        dog2.bark();
    }
}
