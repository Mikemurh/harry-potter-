import java.util.Scanner;



        public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Welcome to Hogwarts! Let the sorting hat choose your house");
        System.out.println("Enter your name:");
        String name = scan.nextLine();

        System.out.println("Answer the following questions yes or no");
        System.out.println("Do you value bravery and chivalry?");
        String answer1 = (scan.nextLine()).toLowerCase();
        System.out.println("Do you value hard work, dedication, and loyalty?");
        String answer2 = (scan.nextLine()).toLowerCase();
        System.out.println("Do you value intelligence, creativity, and learning?");
        String answer3 = (scan.nextLine()).toLowerCase();

        if ( answer1.equals("no") && answer2.equals("no") && answer3.equals("yes")){
            System.out.println("Dear" + name +"," );
            System.out.println("You belong to RavenClaw!");

        }
        if  ( answer1.equals("no") && answer2.equals("no") && answer3.equals("no")){
            System.out.println("Dear" + name +"," );
            System.out.println("You belong to Slytherin!");
        if  ( answer1.equals("yes") ){
            System.out.println("Dear" + name +"," );
            System.out.println("You belong to Gryfindor!");
        }
    }
}}