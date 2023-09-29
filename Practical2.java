import java.util.Scanner;

public class Practical2{

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("How many miles do you drive per day?: ");
        int mpd = input.nextInt();

        System.out.println("How much do toll roads cost you if you travel on them: ");
        int tollcost = input.nextInt();

        System.out.println("How much does parking cost you for a day: ");
        int parking = input.nextInt();

        int gpd = mpd / 36;
        double cpg = gpd * 5.8;

        double totalcost = cpg + tollcost + parking;

        System.out.println("Your total driving cost per day is: ");
        System.out.println(totalcost);




        


    }
}