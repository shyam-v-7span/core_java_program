import java.util.Scanner;

public class loopAssingment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        example ex = new example();
        //ex.Usingfor(a);
        ex.Usingwhile(a);
    }
}

class example{
    public void Usingfor(int a){
        if (a < 100) {
            for (int i = 0; i <= a; i++) {
                if (i%10 == 0) {
                    continue;
                }
                System.out.println(i);
            } 
        }
        else{
            System.out.println("enter number smaller than 100");
        }
    }

    public void Usingwhile(int a){
        int j = 0;
        if (a < 100) {
            while (j < a) {
                j++;
                if (j%10 == 0) {
                    continue;
                }
                System.out.println(j);
                
            } 
        }
        else{
            System.out.println("enter number smaller than 100");
        }
    }

}
