package Capitulo4;

public class TestBloodData {
    
    public static void main(String[] args) {
        
        BloodData bloodData1 = new BloodData();
        System.out.println("Blood type = " + bloodData1.getBloodType());
        System.out.println("Rh = " + bloodData1.getRh());
        
        System.out.println("");
        
        BloodData bloodData2 = new BloodData(BloodType.A,Rh.POSITIVO);
        System.out.println("Blood type = " + bloodData2.getBloodType());
        System.out.println("Rh = " + bloodData2.getRh());
    }
    
}
