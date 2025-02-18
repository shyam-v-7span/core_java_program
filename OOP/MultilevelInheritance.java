class Animal {
    void eat() {
        System.out.println("animal eats food");
    }
}

class Mammal extends Animal {
    void run() {
        System.out.println("Mammals can run");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.run();
        d1.bark();
    }
}
