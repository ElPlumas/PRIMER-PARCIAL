package Main;

import Capitulo10.Candle;
import Capitulo4.Billing;
import Capitulo4.BirdSighting;
import Capitulo4.BloodData;
import Capitulo4.BloodType;
import Capitulo4.Bread;
import Capitulo4.CertificateOfDeposit;
import Capitulo4.Circle;
import Capitulo4.FormLetterWriter;
import Capitulo10.Horse;
import Capitulo10.RaceHorse;
import Capitulo10.Color;
import Capitulo10.Color_1;
import Capitulo10.DoublesTennisGame;
import Capitulo10.Scent;
import Capitulo10.ScentedCandle;
import Capitulo10.TennisGame;
import Capitulo4.MathClass;
import Capitulo4.NextMonth;
import Capitulo4.Patient;
import Capitulo4.Rh;
import Capitulo4.Sandwich;
import Capitulo4.SandwichFilling;
import Capitulo4.State;
import Capitulo4.TwoDice;
import Capitulo4.YearEnd;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("♦FORM LETTER WRITER♦\n");
        
        FormLetterWriter flw1 = new FormLetterWriter();
        FormLetterWriter flw2 = new FormLetterWriter();
        flw1.displaySalutation("Cortés");
        flw2.displaySalutation("Héctor", "Cortés");
        
        System.out.println("\n\n♦Billing♦\n");
        
        Billing test1 = new Billing();
        Billing test2 = new Billing();
        Billing test3 = new Billing();
        Double case1 = test1.computeBill(100);
        System.out.println("case 1 = " + case1);
        Double case2 = test2.computeBill(10, 10);
        System.out.println("case 2 = " + case2);
        Double case3 = test3.computeBill(10, 12, 20);
        System.out.println("case 3 = " + case3);
        
        System.out.println("\n\n♦Bird Sighting♦\n");
        
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
        
        System.out.println("\n\n♦Blood Data♦\n");
        
        //TestBloodData
        BloodData bloodData1 = new BloodData();
        System.out.println("Blood type = " + bloodData1.getBloodType());
        System.out.println("Rh = " + bloodData1.getRh());
        
        System.out.println("");
        
        BloodData bloodData2 = new BloodData(BloodType.A,Rh.POSITIVO);
        System.out.println("Blood type = " + bloodData2.getBloodType());
        System.out.println("Rh = " + bloodData2.getRh());
        
        //TestPatient
        Patient p1 = new Patient();
        System.out.println("\nID number = " + p1.getId());
        System.out.println("Age = " + p1.getAge());
        System.out.println("Blood type = " + p1.getTs().getBloodType() + ", " + p1.getTs().getRh());
        
        System.out.println("");
        
        Patient p2 = new Patient(5, 24, new BloodData(BloodType.AB, Rh.NEGATIVO));
        System.out.println("ID number = " + p2.getId());
        System.out.println("Age = " + p2.getAge());
        System.out.println("Blood type = " + p2.getTs().getBloodType() + ", " + p2.getTs().getRh());
        
        System.out.println("\n\n♦Tip Top Bakery♦\n");
        
        //Bread
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
        
        //SandwichFelling
        SandwichFilling sandwichFilling = new SandwichFilling("egg salad", 221);
        SandwichFilling sandwichFilling1 = new SandwichFilling("fried chicken", 246);
        SandwichFilling sandwichFilling2 = new SandwichFilling("sausage", 301);
        
        System.out.println("\nFilling = " + sandwichFilling.getFilling());
        System.out.println("Calories in a serving = " + sandwichFilling.getCalories() + "\n");
        
        System.out.println("Filling = " + sandwichFilling1.getFilling());
        System.out.println("Calories in a serving = " + sandwichFilling1.getCalories() + "\n");
        
        System.out.println("Filling = " + sandwichFilling2.getFilling());
        System.out.println("Calories in a serving = " + sandwichFilling2.getCalories());
        
        //Sandwich
        Sandwich sandwich = new Sandwich(new Bread("rye", 65), new SandwichFilling("egg salad", 221));
        Sandwich sandwich1 = new Sandwich(new Bread("multigrain", 45), new SandwichFilling("fried chicken", 246));
        Sandwich sandwich2 = new Sandwich(new Bread("whole-wheat", 82), new SandwichFilling("sausage", 301));
        
        System.out.println("\nBread = " + sandwich.getBread().getBreadType() + "\tCalories per slice = " + sandwich.getBread().getCalories());
        System.out.println("Felling = " + sandwich.getSandfill().getFilling() + "\tCalories in a serving = " + sandwich.getSandfill().getCalories());
        System.out.println("Total calories in a sandwich = " + sandwich.getCalories() + "\n");
        
        System.out.println("Bread = " + sandwich1.getBread().getBreadType() + "\tCalories per slice = " + sandwich1.getBread().getCalories());
        System.out.println("Felling = " + sandwich1.getSandfill().getFilling() + "\tCalories in a serving = " + sandwich1.getSandfill().getCalories());
        System.out.println("Total calories in a sandwich = " + sandwich1.getCalories() + "\n");
        
        System.out.println("Bread = " + sandwich2.getBread().getBreadType() + "\tCalories per slice = " + sandwich2.getBread().getCalories());
        System.out.println("Felling = " + sandwich2.getSandfill().getFilling() + "\tCalories in a serving = " + sandwich2.getSandfill().getCalories());
        System.out.println("Total calories in a sandwich = " + sandwich2.getCalories());
        
        System.out.println("\n\n♦Circle♦\n");
        
        Circle circle = new Circle();
        circle.setRadius(5);
        Circle circle1 = new Circle();
        circle1.setRadius(75);
        Circle circle2 = new Circle();
        
        System.out.println("Radius = " + circle.getRadius());
        System.out.println("Diameter = " + circle.getDiameter());
        System.out.println("Area = " + circle.getArea() + "\n");
        
        System.out.println("Radius = " + circle1.getRadius());
        System.out.println("Diameter = " + circle1.getDiameter());
        System.out.println("Area = " + circle1.getArea() + "\n");
        
        System.out.println("Radius = " + circle2.getRadius());
        System.out.println("Diameter = " + circle2.getDiameter());
        System.out.println("Area = " + circle2.getArea());
        
        System.out.println("\n\n♦Math Test♦\n");
        
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
        
        System.out.println("\n\n♦Next Month♦\n");
        
        NextMonth calendar = new NextMonth();
        System.out.println("Days for next month: " + calendar.getNextMonth());
        
        System.out.println("\n\n♦Year End♦\n");
        
        YearEnd calculate = new YearEnd();
        System.out.println("Days from today until the end of the current year: = " + calculate.getYearEnd());
        
        System.out.println("\n\n♦Certificate Of Deposit♦\n");
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        GregorianCalendar date = new GregorianCalendar();
        
        CertificateOfDeposit cD1 = new CertificateOfDeposit(366, "Julián Almaraz", 450.21, date);
        cD1.setMaturityDate();
        
        CertificateOfDeposit cD2 = new CertificateOfDeposit(654, "Martha Zúñiga", 723.5, date);
        cD2.setMaturityDate();
        
        System.out.println("CERTIFICADO 1\nNúmero de certificado: "
                + cD1.getCertificateNumber()
                + "\nNombre: " + cD1.getLastName()
                + "\nSaldo: " + cD1.getBalance() +
                "\nFecha de registro: " + cD1.getIssueDate().get(GregorianCalendar.DATE) +
                "/" + cD1.getIssueDate().get(GregorianCalendar.MONTH) + "/"
                + cD1.getIssueDate().get(GregorianCalendar.YEAR) +
                "\nFecha de vencimiento: " + cD1.getMaturityDate().get(GregorianCalendar.DATE)+
                "/" + cD1.getMaturityDate().get(GregorianCalendar.MONTH) +
                "/" + cD1.getMaturityDate().get(GregorianCalendar.YEAR));
        System.out.println("CERTIFICADO 2\nNúmero de certificado: "
                + cD2.getCertificateNumber()
                + "\nNombre: " + cD2.getLastName()
                + "\nSaldo: " + cD2.getBalance() +
                "\nFecha de registro: " + cD2.getIssueDate().get(GregorianCalendar.DATE) + "/"
                + cD2.getIssueDate().get(GregorianCalendar.MONTH)+"/"
                + cD2.getIssueDate().get(GregorianCalendar.YEAR) +
                "\nFecha de vencimiento: " + cD2.getMaturityDate().get(GregorianCalendar.DATE)
                + "/" + cD2.getMaturityDate().get(GregorianCalendar.MONTH) +
                "/" + cD2.getMaturityDate().get(GregorianCalendar.YEAR));
        System.out.println("\n\n♦State♦\n");
        
        State state = new State("New York", 8398748, "Albany", 97279, "Syracuse", 142749);
        
        System.out.println("State: " + state.getName()  +
                "\nPopulation: " + state.getPopulation());
        state.printCapitalCity();
        state.printMostPopulous();
        
        System.out.println("\n\n♦Two Dice♦\n");
        
        TwoDice dice = new TwoDice();
        
        System.out.println("Dado 1: " + dice.getValue());
        System.out.println("Dado 2: " + dice.getValue2());
        
        System.out.println("\n\n♦Horse♦\n");
        
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
        
        System.out.println("\n\n♦Candle♦\n");
        
        Candle candle = new Candle();
        ScentedCandle scentedCandle = new ScentedCandle();
        
        candle.setColor(Color_1.BLANCO);
        candle.setHeight(3);
        System.out.println("Candle color : " + candle.getColor() +
                "\nCandle height: " + candle.getHeight() +
                "\nCandle price : $" + candle.getPrice());
        
        scentedCandle.setScent(Scent.ALMENDRA);
        scentedCandle.setColor(Color_1.AZUL);
        scentedCandle.setHeight(3);
        System.out.println("\n\nScented candle: " + scentedCandle.getScent() +
                "\nScented candle color: " + scentedCandle.getColor() +
                "\nScented candle height: " + scentedCandle.getHeight() +
                "\nScented candle price: $" + scentedCandle.getPrice());
        
        System.out.println("\n\n♦Tennis Game♦\n");
        
        TennisGame tennisGame = new TennisGame();
        TennisGame tennisGame2 = new TennisGame();
        TennisGame tennisGame3 = new TennisGame();
        TennisGame tennisGame4 = new TennisGame();
        TennisGame tennisGame5 = new TennisGame();
        DoublesTennisGame doublesTennisGame = new DoublesTennisGame();
        DoublesTennisGame doublesTennisGame2 = new DoublesTennisGame();
        DoublesTennisGame doublesTennisGame3 = new DoublesTennisGame();
        DoublesTennisGame doublesTennisGame4 = new DoublesTennisGame();
        DoublesTennisGame doublesTennisGame5 = new DoublesTennisGame();
        
        tennisGame.setPlayers("Fernando", "Javier");
        tennisGame.setScores(4, 10);
        tennisGame2.setPlayers("Fernando", "Javier");
        tennisGame2.setScores(2, 3);
        tennisGame3.setPlayers("Fernando", "Javier");
        tennisGame3.setScores(4, 4);
        tennisGame4.setPlayers("Fernando", "Javier");
        tennisGame4.setScores(1, 1);
        tennisGame5.setPlayers("Fernando", "Javier");
        tennisGame5.setScores(0, 4);
        
        doublesTennisGame.setPlayers("Luis", "Carmen", "Michelle", "Bruno");
        doublesTennisGame.setScores(5, 4);
        doublesTennisGame2.setPlayers("Luis", "Carmen", "Michelle", "Bruno");
        doublesTennisGame2.setScores(2, 3);
        doublesTennisGame3.setPlayers("Luis", "Carmen", "Michelle", "Bruno");
        doublesTennisGame3.setScores(4, 4);
        doublesTennisGame4.setPlayers("Luis", "Carmen", "Michelle", "Bruno");
        doublesTennisGame4.setScores(1, 1);
        doublesTennisGame5.setPlayers("Luis", "Carmen", "Michelle", "Bruno");
        doublesTennisGame5.setScores(0, 4);
        
        tennisGame.showData(tennisGame);
        tennisGame2.showData(tennisGame2);
        tennisGame3.showData(tennisGame3);
        tennisGame4.showData(tennisGame4);
        tennisGame5.showData(tennisGame5);
        doublesTennisGame.showData(doublesTennisGame);
        doublesTennisGame2.showData(doublesTennisGame2);
        doublesTennisGame3.showData(doublesTennisGame3);
        doublesTennisGame4.showData(doublesTennisGame4);
        doublesTennisGame5.showData(doublesTennisGame5);

    }

}
