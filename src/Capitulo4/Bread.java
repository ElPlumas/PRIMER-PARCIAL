package Capitulo4;

public class Bread {
    
    private String breadType;
    private Integer calories;
    public static final String MOTTO = "The staff of life";

    public Bread(String breadType, Integer calories) {
        this.breadType = breadType;
        this.calories = calories;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }
    
    public static void main(String[] args) {
        
        Bread bread = new Bread("rye", 65);
        Bread bread1 = new Bread("multigrain", 45);
        Bread bread2 = new Bread("whole-wheat", 82);
        
        System.out.println("Bread type = " + bread.getBreadType());
        System.out.println("Calories per slice = " + bread.getCalories() + "\n");
        
        System.out.println("Bread type = " + bread1.getBreadType());
        System.out.println("Calories per slice = " + bread1.getCalories() + "\n");
        
        System.out.println("Bread type = " + bread2.getBreadType());
        System.out.println("Calories per slice = " + bread2.getCalories() + "\n");
        
        System.out.println(Bread.MOTTO);
        
    }
    
}
