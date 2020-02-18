package Capitulo4;

public class SandwichFilling {
    
    private String filling;
    private Integer calories;

    public SandwichFilling(String filling, Integer calories) {
        this.filling = filling;
        this.calories = calories;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }
    
    public static void main(String[] args) {
        
        SandwichFilling sandwichFilling = new SandwichFilling("egg salad", 221);
        SandwichFilling sandwichFilling1 = new SandwichFilling("fried chicken", 246);
        SandwichFilling sandwichFilling2 = new SandwichFilling("sausage", 301);
        
        System.out.println("Filling = " + sandwichFilling.getFilling());
        System.out.println("Calories in a serving = " + sandwichFilling.getCalories() + "\n");
        
        System.out.println("Filling = " + sandwichFilling1.getFilling());
        System.out.println("Calories in a serving = " + sandwichFilling1.getCalories() + "\n");
        
        System.out.println("Filling = " + sandwichFilling2.getFilling());
        System.out.println("Calories in a serving = " + sandwichFilling2.getCalories());
        
    }
    
}
