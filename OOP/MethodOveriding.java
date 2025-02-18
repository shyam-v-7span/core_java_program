class Animal {
    void eat() {
        System.out.println("Animal can eat anything");
    }
}

class Donkey extends Animal {

    @Override
    void eat() {
        System.out.println("Donkey eats grass");
    }
}

public class MethodOveriding {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat();
        Donkey d1 = new Donkey();
        d1.eat();
    }
}