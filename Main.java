import java.util.*;
public class Main {
    public static void main(String[] args) {
        // This prints "Hello, World!" to the console
        System.out.println("Hello, World!");
        System.out.println("Fibonacci Sequence");
        int f1=1;
        int f2=2;
    
        for(int i=0;i<15;i++){
            int temp =f1+f2;
            f1=f2;
            f2=temp;
            System.out.print(f1);
            System.out.print(" ");
        }
    }
}
