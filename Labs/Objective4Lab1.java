import java.util.Scanner;
public class Objective4Lab1{
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

    System.out.println("What is your first name?");
    fname = keyboard.nextLine();
    System.out.println("What is your last name?");
    lname = keyboard.nextLine();
    System.out.println("What is your favorite animal?");
    favoriteAnimal = keyboard.nextLine();
    System.out.println("What is your favorite food?");
    favoriteFood = keyboard.nextLine();
    System.out.println("What is your favorite song?");
    favoriteSong = keyboard.nextLine();

    System.out.print("My name is "+ fname + " "+ lname+".\n" + "My favorite animal is the " + favoriteAnimal +".\n" + "My favorite food is " + favoriteFood +".\n" + "My favorite song is "+ favoriteSong +".");
  }
}
