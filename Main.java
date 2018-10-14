import java.util.Random;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       int[] array=new int[1000000];
       Random random=new Random();
       for (int i = 0; i < array.length; i++) {
           array[i]=random.nextInt(array.lenght);
       }

       System.out.println("Dime un numero");
       int num=teclado.nextInt();
       boolean esta=false;
       long empieza=System.currentTimeMillis();
       for (int i = 0; i < array.length; i++) {
           if (array[i]==num){
               esta=true;
           }
       }
       long termina=System.currentTimeMillis();
       if (esta) System.out.println("Esta en la lista "+(empieza-termina));
       else System.out.println("No esta en la lista "+(empieza-termina));
   }
}



