import java.util.Scanner;

public class Conditional{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Hello user please enter your name: ");
        String name = input.nextLine();
        int namelen = name.length();

        if(namelen != 0){
           System.out.printf("Hello %s%n", name);
        }
        else{
           System.out.println("Alright then, keep your secrets.");
        }
    }
}
