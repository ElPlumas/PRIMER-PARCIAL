package Capitulo4;

public class Sandwich {
    
    private Bread bread;
    private SandwichFilling sandfill;

    public Sandwich(Bread bread, SandwichFilling sandfill) {
        this.bread = bread;
        this.sandfill = sandfill;
    }

    public Integer getCalories(){
        return (2*this.bread.getCalories()) + this.sandfill.getCalories();
    }
    
    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public SandwichFilling getSandfill() {
        return sandfill;
    }

    public void setSandfill(SandwichFilling sandfill) {
        this.sandfill = sandfill;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sandwich sandwich = new Sandwich(new Bread("rye", 65), new SandwichFilling("egg salad", 221));
        Sandwich sandwich1 = new Sandwich(new Bread("multigrain", 45), new SandwichFilling("fried chicken", 246));
        Sandwich sandwich2 = new Sandwich(new Bread("whole-wheat", 82), new SandwichFilling("sausage", 301));
        
        System.out.println("Bread = " + sandwich.getBread().getBreadType() + "\tCalories per slice = " + sandwich.getBread().getCalories());
        System.out.println("Felling = " + sandwich.getSandfill().getFilling() + "\tCalories in a serving = " + sandwich.getSandfill().getCalories());
        System.out.println("Total calories in a sandwich = " + sandwich.getCalories() + "\n");
        
        System.out.println("Bread = " + sandwich1.getBread().getBreadType() + "\tCalories per slice = " + sandwich1.getBread().getCalories());
        System.out.println("Felling = " + sandwich1.getSandfill().getFilling() + "\tCalories in a serving = " + sandwich1.getSandfill().getCalories());
        System.out.println("Total calories in a sandwich = " + sandwich1.getCalories() + "\n");
        
        System.out.println("Bread = " + sandwich2.getBread().getBreadType() + "\tCalories per slice = " + sandwich2.getBread().getCalories());
        System.out.println("Felling = " + sandwich2.getSandfill().getFilling() + "\tCalories in a serving = " + sandwich2.getSandfill().getCalories());
        System.out.println("Total calories in a sandwich = " + sandwich2.getCalories());
        
    }
    
}
