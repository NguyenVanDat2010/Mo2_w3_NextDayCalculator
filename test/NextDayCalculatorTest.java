import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    @DisplayName("Case: 01-01-2018")
    public void testNextDay_01012018() {
        int inputDay = 1;
        int inputMonth = 1;
        int inputYear = 2018;
        String expected = "2-1-2018";
        String result = NextDayCalculator.nextDay(inputDay, inputMonth, inputYear);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case: 31-01-2018")
    public void testNextDay_31012018() {
        int inputDay = 31;
        int inputMonth = 1;
        int inputYear = 2018;
        String expected = "1-2-2018";
        String result = NextDayCalculator.nextDay(inputDay, inputMonth, inputYear);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case: 30-04-2018")
    public void testNextDay_30042018() {
        int inputDay = 30;
        int inputMonth = 4;
        int inputYear = 2018;
        String expected = "1-5-2018";
        String result = NextDayCalculator.nextDay(inputDay, inputMonth, inputYear);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case: 28-02-2018")
    public void testNextDay_28022018() {
        int inputDay = 28;
        int inputMonth = 2;
        int inputYear = 2018;
        String expected = "1-3-2018";
        String result = NextDayCalculator.nextDay(inputDay, inputMonth, inputYear);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case: 29-02-2020")
    public void testNextDay_29022018() {
        int inputDay = 29;
        int inputMonth = 2;
        int inputYear = 2020;
        String expected = "1-3-2020";
        String result = NextDayCalculator.nextDay(inputDay, inputMonth, inputYear);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case: 02/2020")
    public void testLastOfMonth() {
        int inputMonth = 2;
        int inputYear = 2020;
        int expected = 29;
        int result = NextDayCalculator.lastOfMonth(inputMonth, inputYear);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case: 2020")
    public void testIsLeapYear() {
        int inputYear = 2020;
        int expected = 29;
        int result = NextDayCalculator.isLeapYear(inputYear);
        assertEquals(expected, result);
    }
}