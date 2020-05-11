public class NextDayCalculator {

    public static final int FIRST_OF_MONTH = 1;
    public static final int LAST_OF_MONTH = 31;
    public static final int FIRST_OF_YEAR = 1;
    public static final int LAST_OF_YEAR = 12;

    public static String nextDay(int day, int month, int year) {
//        throw new UnsupportedOperationException();
        int outputDay = day;
        int outputMonth = month;
        int outputYear = year;

        if (day == LAST_OF_MONTH && month == LAST_OF_YEAR) {
            outputDay = FIRST_OF_MONTH;
            outputMonth = FIRST_OF_YEAR;
            outputYear = ++year;
        } else if (day == lastOfMonth(month, year)) {
            outputDay = FIRST_OF_MONTH;
            outputMonth = ++month;
        } else {
            outputDay = ++day;
        }
        String result = outputDay + "-" + outputMonth + "-" + outputYear;
        return result;
    }

    public static int lastOfMonth(int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year);
            default:
                return LAST_OF_MONTH;
        }
    }

    public static int isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return 29;
                }
            } else {
                return 29;
            }
        }
        return 28;
    }
}
