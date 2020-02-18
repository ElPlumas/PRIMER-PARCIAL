package Capitulo4;

public class MathClass {

    Integer a;
    Integer b;
    Double c;
    Character d1;
    Integer d2;
    
    public Double getSquareRoot(){
        return Math.sqrt(this.a);
    }
    
    public Double getSin(){
        return Math.sin(this.b);
    }
    
    public Double getCos(){
        return Math.cos(this.b);
    }
    
    public Double getFloor(){
        return Math.floor(this.c);
    }
    
    public Double getCeiling(){
        return Math.ceil(this.c);
    }
    
    public Long getRound(){
        return Math.round(this.c);
    }
    
    public Integer getLarger(){
        return Math.max(this.d1, this.d2);
    }
    
    public Integer getSmaller(){
        return Math.min(this.d1, this.d2);
    }
    
    public Integer getRamdom(){
        return (int)((Math.random() * 10) + (Math.random() * 10));
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public void setD1(Character d1) {
        this.d1 = d1;
    }

    public void setD2(Integer d2) {
        this.d2 = d2;
    }
    
    public static void main(String[] args) {

        MathClass mathClass = new MathClass();
        mathClass.setA(37);
        mathClass.setB(300);
        mathClass.setC(22.8);
        mathClass.setD1('D');
        mathClass.setD2(71);
        
        System.out.println("a. Square root of 37 = " + mathClass.getSquareRoot());
        System.out.println("b. Sine of 300 = " + mathClass.getSin() + " Cosine of 300 = " + mathClass.getCos());
        System.out.println("c. Floor of 22.8 =  = " + mathClass.getFloor() + " Ceiling of 22.8 = " + mathClass.getCeiling() + " Round of 22.8 = " + mathClass.getRound());
        System.out.println("d. Larger of D and 71 = " + mathClass.getLarger() + " Smaller of D and 71 = " + mathClass.getSmaller());
        System.out.println("e. Ramdom number = " + mathClass.getRamdom());
    
    }
    
}
