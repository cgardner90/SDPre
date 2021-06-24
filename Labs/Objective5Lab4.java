import java.util.Scanner;
public class Objective5Lab4{
  public static void main(String[] args){

    Scanner userInput = new Scanner(System.in);
    int numToCheck = 0;
    System.out.println("Please enter a number: ");
    numToCheck = userInput.nextInt();

    if(numToCheck%2 !=0)
      System.out.println(numToCheck + " is odd.");
    else
      System.out.println(numToCheck + " is even.");



  }
}
