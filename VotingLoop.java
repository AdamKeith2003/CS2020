public class VotingLoop{
    public static void main(String[]args){
        int age = 6;
        if(age<=18){
            System.out.println("You are not eligible to vote.");

        }
        else if(age<=10){
            System.out.println("You are underage, go get your parents to vote instead.");
        }
        else{
            System.out.println("You are eligible to vote");
        }
    }
}