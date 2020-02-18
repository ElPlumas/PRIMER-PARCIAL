package Capitulo4;

public class Billing {
    
    public Double computeBill(Integer price){
        return (double)price + (price * 0.08);
    }
    
    public Double computeBill(Integer price, Integer quantity){
        return (double)(price * quantity) + (price * quantity * 0.08);
    }
    
    public Double computeBill(Integer price, Integer quantity, Integer coupon){
        return (double)((price * quantity) - coupon) + ((price * quantity - coupon)*0.08);
    }
    
    public static void main(String[] args) {
        
        Billing test1 = new Billing();
        Billing test2 = new Billing();
        Billing test3 = new Billing();
        Double case1 = test1.computeBill(100);
        System.out.println("case 1 = " + case1);
        Double case2 = test2.computeBill(10, 10);
        System.out.println("case 2 = " + case2);
        Double case3 = test3.computeBill(10, 12, 20);
        System.out.println("case 3 = " + case3);
        
    }
    
}
