package Capitulo10;

public class Year {
    
    private Integer yearDays;
    
    public Year () {
        this.yearDays = 365;
    }
    
    public Year (Integer days) {
        this.yearDays = days;
    }
    
    public Integer getYearDays () {
        return this.yearDays;
    }
    
    public Integer daysElapsed (Integer month, Integer day) {
        Integer daysElapsed = day - 1;
        month --;
        while (month > 0) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysElapsed += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysElapsed += 30;
                    break;
                case 2:
                    daysElapsed += 28;
                    break;
            }
            month --;
        }

        return daysElapsed;
    }
    
    public static void main(String[] args) {
        
        Year year = new Year();
        LeapYear leapYear = new LeapYear();
        
        Integer month = 3;
        Integer day = 3;
        
        System.out.println("Año: " + year.getYearDays() + " días");
        System.out.println("Año bisiesto: " + leapYear.getYearDays() + " días");
        
        System.out.println("Día: " + day + "\nMes: " + month +
                "\nEn un año normal han pasado: " + year.daysElapsed(month, day) +
                " días\nEn un año bisiesto han pasado: " +
                leapYear.daysElapsed(month, day) + " días");
    }
    
}
