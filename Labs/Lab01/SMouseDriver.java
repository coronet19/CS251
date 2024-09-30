import java.util.Scanner;

public class SMouseDriver
{
  public static void main(String[] args) 
  {
    Scanner stdIn = new Scanner(System.in);
    SMouse mighty = new SMouse();  
    SMouse mickey = new SMouse();
    
    System.out.println("Enter an age for Mighty.");
    int mightyAge = stdIn.nextInt();
    System.out.println(""); 

    for(int i = 0; i < mightyAge; i++){
      mighty.grow();
    }

    System.out.println("Mighty's Stats: ");
    mighty.display();

    System.out.println("");

    System.out.println("Enter an age for Mickey.");
    int mickeyAge = stdIn.nextInt();
    System.out.println(""); 

    for(int i = 0; i < mickeyAge; i++){
      mickey.grow();
    }
    
    System.out.println("Mickey's Stats: ");
    mickey.display();
    
    stdIn.close();
  }
}
