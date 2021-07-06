import java.util.Scanner;
public class Objective9Lab4{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double num1, num2, average;


      System.out.println("Please enter a number: ");
      num1 = scan.nextDouble();
      System.out.println("Please enter another number:" );
      num2 = scan.nextDouble();
      average = findAverage(num1, num2);
      System.out.println("The average of "+ num1+
                          " and " + num2 + " is: " + average);
      scan.close();


    }

    public static double findAverage(double x, double y){
      double sum = x+y;
      double average = (sum/2);
      return average;

  }
}
