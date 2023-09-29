import java.util.Scanner;


public class LoopTest{
        public static void main(String[]args){
            Scanner input = new Scanner(System.in);
            int[] array = {34,56,36,78,32,63,63,72,67,14};
            for(int counter = 0;counter < array.length;counter++){
                System.out.printf("%d%n",array[counter]);
            }


        }

}