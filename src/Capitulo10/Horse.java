/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo10;

/**
 *
 * @author -----
 */
public class Horse {
    
    private String name;
    private Integer birthYear;
    private Color color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Horse h1 = new Horse();
        RaceHorse rH = new RaceHorse();
        Horse h2 = new RaceHorse();
        
        h1.setBirthYear(2003);
        h1.setColor(Color.AZABACHE);
        h1.setName("Loris");
        
        rH.setColor(Color.BLANCO);
        rH.setBirthYear(1997);
        rH.setName("Poninas");
        rH.setRacesNumber(140);
        
        h2.setBirthYear(2009);
        h2.setColor(Color.CASTOÑO);
        h2.setName("Don");
        
        System.out.println("FIRST HORSE: " + h1.getName() +
                "\nBirth year: " + h1.getBirthYear() + 
                "\nColor: " + h1.getColor());
        System.out.println("\n\nSECOND HORSE: " + h2.getName() +
                "\nBirth year: " + h2.getBirthYear() + 
                "\nColor: " + h2.getColor());
        System.out.println("\n\nRACE HORSE: " + rH.getName() +
                "\nBirth year: " + rH.getBirthYear() + 
                "\nColor: " + rH.getColor() +
                "\nRaces Number: " + rH.getRacesNumber());
    }
    
}
