package Capitulo4;

public class Circle {

    private Integer radius, diameter; 
    private Float area;

    public Circle() {
        this.radius = 1;
        this.diameter = 2 * this.radius;
        this.area = (float)(Math.PI * (this.radius * this.radius));
    }

    public Integer getRadius() {
        return radius;
    }
    
    public Integer getDiameter(){
        return diameter;
    }
    
    public Float getArea(){
        return area;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
        this.diameter = 2 * this.radius;
        this.area = (float)(Math.PI * (this.radius *this.radius));
    }
    
    public static void main(String[] args) {
        
        Circle circle = new Circle();
        circle.setRadius(5);
        Circle circle1 = new Circle();
        circle1.setRadius(75);
        Circle circle2 = new Circle();
        
        System.out.println("Radius = " + circle.getRadius());
        System.out.println("Diameter = " + circle.getDiameter());
        System.out.println("Area = " + circle.getArea() + "\n");
        
        System.out.println("Radius = " + circle1.getRadius());
        System.out.println("Diameter = " + circle1.getDiameter());
        System.out.println("Area = " + circle1.getArea() + "\n");
        
        System.out.println("Radius = " + circle2.getRadius());
        System.out.println("Diameter = " + circle2.getDiameter());
        System.out.println("Area = " + circle2.getArea());
    }
    
}
