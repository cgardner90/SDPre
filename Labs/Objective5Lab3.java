import java.util.Scanner;
public class Objective5Lab3{
  public static void main(String[] args) {
    int num1 = 0;
    Scanner userInput = new Scanner(System.in);

    System.out.println("Please input a number");
    num1 = userInput.nextInt();

    if(num1 > 0)
      System.out.println(num1 + " is positive.");
    else if(num1 == 0)
        System.out.println(num1 + " is equal to 0.");

      else if(num1 < 0)
        System.out.println(num1 + " is negative.");
userInput.close();


  }
}
