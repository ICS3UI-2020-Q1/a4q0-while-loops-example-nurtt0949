import java.util.Scanner;
/**
 * While loop example
 * 
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
    Scanner input = new Scanner(System.in);
   
    //declare a variable
    int upTo;
    do{
     System.out.println("What number to count to (positive number) "); 
     upTo = nextLine();
    }while(upTo <= 0);
  
  
  
  
  public static void main(String[] args) {
    int upTo = input.nextInt();
    // create a variable to keep track of number
    int count = 1;
    // using loop to count up to 5
    while(true) (count == 5) {
      break
      // print the number we are arguments
      System.out.println(count);
      // increase the value of count by 1
      count = count + 1;

    }
    System.out.println("All Done");
  }

  // same thing with do-while loop
  int count2 = 4
  // do while loop
  do{
  //print the number
  count2 = count2 + 1
}while(count2<=upTo);System.out.println("All done again");
}
