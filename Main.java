import java.util.Random;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       int[] array=new int[50000];
       Random random=new Random();
       for (int i = 0; i < array.length; i++) {
           array[i]=random.nextInt(50000);
       }
       System.out.println("Dime un numero");
       int num=teclado.nextInt();
       boolean esta=false;
       for (int i = 0; i < array.length; i++) {
           if (array[i]==num){
               esta=true;
           }
       }
       if (esta) System.out.println("Esta en la lista");
       else System.out.println("No esta en la lista");
   }
}

