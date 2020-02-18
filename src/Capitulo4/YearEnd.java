package Capitulo4;

import java.util.GregorianCalendar;

public class YearEnd {

    Integer yearDays;
    Integer today;
    Integer year;
    
    GregorianCalendar calendar = new GregorianCalendar();
    
    public YearEnd () {
        
        this.today = calendar.get(GregorianCalendar.DAY_OF_YEAR);
        this.year = calendar.get(GregorianCalendar.YEAR);
        
        if (this.year % 4 == 0) {
            this.yearDays = 366;
        }else {
            this.yearDays = 365;
        }
        
    }
    
    public Integer getYearEnd () {
        return this.yearDays - this.today;
    }
    
    public static void main(String[] args) {
        
        YearEnd calculate = new YearEnd();
        System.out.println("Days from today until the end of the current year: = " + calculate.getYearEnd());
        
    }
    
}
