public class Circle
{
  private double radius;
  private static int instanceCount = 0;


  public Circle(){
    this.instanceCount++;
    this.setRadius(1);
  }

  public Circle(double radius){
    this.instanceCount++;
    this.setRadius(radius);
  }

  public Circle(Circle copy){
    this.instanceCount++;
    this.setRadius(copy.getRadius());
  }

  public double getRadius()
  {
    return this.radius;
  }

  private void setRadius(double radius)
  {
    if (radius >= 0)
      this.radius = radius;
    else
      this.radius = 0;
  }

  public void resize(double newRadius)
  {
    this.setRadius(newRadius);
  }

  public Circle clone()
  {
    return new Circle(this);

    // Circle c = new Circle();
    // c.resize(this.getRadius());
    // return c;
  }

  public boolean equals(Circle guest)
  {
    return guest.getRadius() == this.getRadius();
  }
  
  public void print()
  {
    System.out.print("The circle\'s radius is " +
    this.getRadius());
  }

  public static int getInstanceCount(){
    return instanceCount;
  }
}
