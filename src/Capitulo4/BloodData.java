package Capitulo4;

public class BloodData {
    
    private BloodType bloodType;
    private Rh Rh;
    
    public BloodData() {
        this.bloodType = BloodType.O;
        this.Rh = Rh.POSITIVO;
    }

    public BloodData(BloodType bloodType, Rh rh) {
        this.bloodType = bloodType;
        this.Rh = rh;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public Rh getRh() {
        return Rh;
    }

    public void setRh(Rh Rh) {
        this.Rh = Rh;
    }
    
}