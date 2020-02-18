package Capitulo4;

public class BirdSighting {
    
    String specie;
    Integer specieNumber;
    Integer dayOfYear;

    public BirdSighting(){
        this.specie = "robin";
        this.specieNumber = 1;
        this.dayOfYear = 1;
        
    }
    public void BirdSighting(String specie, Integer specieNumber, Integer dayOfYear){
        this.specie = specie;
        this.specieNumber = specieNumber;
        this.dayOfYear = dayOfYear;
        
    }
    
    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public Integer getSpecieNumber() {
        return specieNumber;
    }

    public void setSpecieNumber(Integer specieNumber) {
        this.specieNumber = specieNumber;
    }

    public Integer getDayOfYear() {
        return dayOfYear;
    }

    public void setDayOfYear(Integer dayOfYear) {
        this.dayOfYear = dayOfYear;
    }
    
    //TestBirdSighting
    public static void main(String[] args) {
        // TODO code application logic here
        BirdSighting birdSighting1 = new BirdSighting();
        
        String specie = birdSighting1.getSpecie();
        Integer specieNumber = birdSighting1.getSpecieNumber();
        Integer dayOfYear = birdSighting1.getDayOfYear();
        
        System.out.println("Specie = " + specie);
        System.out.println("Specie number = " + specieNumber);
        System.out.println("Day of the year  = " + dayOfYear);
        
        System.out.println("");
        
        BirdSighting birdSighting2 = new BirdSighting();
        birdSighting2.BirdSighting("Eagle", 2, 91);
        specie = birdSighting2.getSpecie();
        specieNumber = birdSighting2.getSpecieNumber();
        dayOfYear = birdSighting2.getDayOfYear();
        
        System.out.println("Specie = " + specie);
        System.out.println("Specie Number = " + specieNumber);
        System.out.println("Day of the year = " + dayOfYear);
        
    }
    
}
