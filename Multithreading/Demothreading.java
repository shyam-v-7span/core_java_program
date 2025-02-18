// class A implements Runnable{
//     public void run(){
//         for (int i = 0; i < 10; i++) {
//             System.out.println("hello"); 
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }  
//         }
//     }
// }

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demothreading {
    public static void main(String[] args) {
        Runnable a = new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("hello");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        // A a = new A();
        B b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}