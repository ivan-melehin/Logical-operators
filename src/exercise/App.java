package exercise;

public class App {
    // BEGIN (write your solution here)
    public static boolean isLeapYear( int year){//method checks whether the year is leap year or not
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;// method takes year and checks whether the number is divisible by 400 without a remainder or 4 and not a multiple of 100.
    }
    public static void main(String[] args) {
        var result = App.isLeapYear(2022);//input year
        System.out.println(result);// output result true or false
    }
    // END
}
