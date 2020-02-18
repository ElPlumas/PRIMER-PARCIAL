package Capitulo4;

public class FormLetterWriter {
    
    public void displaySalutation(String lastName){
        System.out.println("Dear Mr. or Ms. " + lastName);
        System.out.println("Thank you for your recent order.");
    }
    
    public void displaySalutation(String name, String lastName){
        System.out.println("Dear " + name + " " + lastName);
        System.out.println("Thank you for your recent order.");
    }
    
    public static void main(String[] args) {

        FormLetterWriter flw1 = new FormLetterWriter();
        FormLetterWriter flw2 = new FormLetterWriter();
        flw1.displaySalutation("Cortés");
        flw2.displaySalutation("Héctor", "Cortés");

    }
    
}