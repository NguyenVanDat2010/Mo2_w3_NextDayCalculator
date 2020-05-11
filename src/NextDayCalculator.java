public class NextDayCalculator {
    public static String nextDay(int day,int month, int year){
//        throw new UnsupportedOperationException();
        if (day==lastOfMonth(month,year)){
            day=1;
            month++;
        }else {
            day++;
        }
        String result= day +"-"+ month +"-"+ year;
        return result;
    }
    public static int lastOfMonth(int month,int year){
        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year);
            default:
                return 31;
        }
    }
    public static int isLeapYear(int year){
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    return 29;
                }
            }else {
                return 29;
            }
        }
        return 28;
    }
}
