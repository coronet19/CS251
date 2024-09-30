public class Circle{
    private double radius;


    public Circle(){
        this.setRadius(1.0);
    }

    private Circle(double radius){
        this.setRadius(radius);
    }


    public void resize(double newRadius){
        this.setRadius(newRadius);
    }

    public Circle clone(){
        return new Circle(this.getRadius());
    }

    public boolean equals(Circle guest){
        return this.getRadius() == guest.getRadius();
    }

    public void print(){
        System.out.print(this.getRadius());
    }

    public double getRadius(){
        return this.radius;
    }

    private void setRadius(double newRadius){
        if(newRadius >0){
            this.radius = newRadius;
        }
    }
}