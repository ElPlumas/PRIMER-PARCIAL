package Capitulo4;

public class TwoDice {
    
    private Integer randomValue;
    private Integer randomValue2;
    private final Integer HIGHEST_DIE_VALUE = 6;
    private final Integer LOWEST_DIE_VALUE = 1;
    
    
    public TwoDice (){
        randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE +
        LOWEST_DIE_VALUE);
        
        randomValue2 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE +
        LOWEST_DIE_VALUE);
    }
    
    public Integer getValue(){
        return randomValue;
    }
    
    public Integer getValue2(){
        return randomValue2;
    }
    
    public static void main(String[] args) {

        TwoDice dice = new TwoDice();
        
        System.out.println("Dado 1: " + dice.getValue());
        System.out.println("Dado 2: " + dice.getValue2());

    }
    
}
