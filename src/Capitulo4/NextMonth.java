package Capitulo4;

import java.util.GregorianCalendar;

public class NextMonth {
    
    Integer day;
    Integer month;
    Integer monthDays;
    Integer year;
    
    GregorianCalendar calendar = new GregorianCalendar();
    
    public NextMonth () {
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.day = calendar.get(GregorianCalendar.DATE);
        this.month = calendar.get(GregorianCalendar.MONTH);
        if (this.month == 1) {
            if (this.year % 4 == 0) {
                this.monthDays = 29;
            }else {
                this.monthDays = 28;
            }
        }else if (this.month % 2 == 0) {
            this.monthDays = 31;
        }else {
            this.monthDays = 30;
        }
    }
    
    public Integer getNextMonth () {
        return this.monthDays - this.day;
    }
    
    public static void main(String[] args) {
        
        NextMonth calendar = new NextMonth();
        System.out.println("Days for next month: " + calendar.getNextMonth());
   
    }
    
}
