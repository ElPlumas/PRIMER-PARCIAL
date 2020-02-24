package Capitulo10;

public class LeapYear extends Year{
    
    public LeapYear () {
        super(366);
    }
    
    @Override
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
                    daysElapsed += 29;
                    break;
            }
            month --;
        }

        return daysElapsed;
    }
    
}
