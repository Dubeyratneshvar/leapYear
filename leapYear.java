import java.util.Scanner;

/**
 * leapYear
 */
public class leapYear {

    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year:");
        year = sc.nextInt();

        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " is leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " not leap year");
        } else {
            System.out.println(year + " not leap year");
        }
    }
}