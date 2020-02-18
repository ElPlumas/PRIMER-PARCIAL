package Capitulo4;

public class Patient {
    
    private Integer id;
    private Integer age;
    private BloodData ts;
    
    public Patient(){
        this.id = 0;
        this.age = 0;
        this.ts = new BloodData();
    }

    public Patient(Integer id, Integer age, BloodData ts) {
        this.id = id;
        this.age = age;
        this.ts = ts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BloodData getTs() {
        return ts;
    }

    public void setTs(BloodData ts) {
        this.ts = ts;
    }
    
    public static void main(String[] args) {
        
        Patient p1 = new Patient();
        System.out.println("ID number = " + p1.getId());
        System.out.println("Age = " + p1.getAge());
        System.out.println("Blood type = " + p1.getTs().getBloodType() + ", " + p1.getTs().getRh());
        
        System.out.println("");
        
        Patient p2 = new Patient(5, 24, new BloodData(BloodType.AB, Rh.NEGATIVO));
        System.out.println("ID number = " + p2.getId());
        System.out.println("Age = " + p2.getAge());
        System.out.println("Blood type = " + p2.getTs().getBloodType() + ", " + p2.getTs().getRh());
    
    }
    
}
