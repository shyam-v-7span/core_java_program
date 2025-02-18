abstract class Animal {

   abstract void walk();

   void eat() {
       System.out.println("animal eats food");
   }
}


class Horse extends Animal {
   void walk() {
       System.out.println("Horse walks on 4 legs");
   }
}

public class AbstractDemo {
   public static void main(String args[]) {
      Horse h1 = new Horse();
      h1.walk();
      h1.eat();
   }
}
