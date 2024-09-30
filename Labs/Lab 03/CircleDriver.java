import java.util.Scanner;

public class CircleDriver
{
  public static void main(String[] args) 
  {
    Scanner stdIn = new Scanner(System.in);
	
    Circle big = new Circle();  
    Circle small = new Circle();

    System.out.println("");
    System.out.print("Big : ");
    big.print();
    // System.out.println("big instance count: " + big.getInstanceCount());

    System.out.println("");
    System.out.print("Small : ");
    small.print();
    // System.out.println("small instance count: " + small.getInstanceCount());

    System.out.println("\n");
    
    double bigRadius;
    System.out.print("Enter the radius of a big circle : ");
    bigRadius = stdIn.nextDouble();
    big.resize(bigRadius);
    // System.out.println("big instance count: " + big.getInstanceCount());

    double smallRadius;
    System.out.print("Enter the radius of small circle : ");
    smallRadius = stdIn.nextDouble();
    small.resize(smallRadius);
    // System.out.println("small instance count: " + small.getInstanceCount());

    System.out.println("");
    System.out.print("Big : ");
    big.print();
    // System.out.println("big instance count: " + big.getInstanceCount());

    System.out.println("");
    System.out.print("Small : ");
    small.print();
    // System.out.println("small instance count: " + small.getInstanceCount());

    System.out.println("");
    if (big.equals(small))
      System.out.println(" big equals small ");
    else
      System.out.println(" big does not equals small ");
    // System.out.println("big instance count: " + big.getInstanceCount());

    System.out.println("");
    Circle bigCopy = big.clone();    
    System.out.print("BigCopy : ");
    bigCopy.print();

    System.out.println("");
    if (bigCopy.equals(big))
      System.out.println(" bigCopy equals big ");
    else
      System.out.println(" bigCopy does not equals big ");

    System.out.println("");
    System.out.println("big instance count: " + Circle.getInstanceCount());
    // System.out.println("small instance count: " + small.getInstanceCount());
    // System.out.println("bigCopy instance count: " + bigCopy.getInstanceCount());

    
    
  }
}
