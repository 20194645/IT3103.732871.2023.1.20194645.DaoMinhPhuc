import java.util.Scanner;

public class ex6_4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a month (full name, abbreviation, 3 letters, or number): ");
            String inputMonth = scanner.nextLine().toLowerCase();

            String[] months = {
                "january", "jan.", "jan", "1", 
                "february", "feb.", "feb", "2", 
                "march", "mar.", "mar", "3", 
                "april", "apr.", "apr", "4", 
                "may", "5", 
                "june", "jun", "6", 
                "july", "jul", "7", 
                "august", "aug.", "aug", "8", 
                "september", "sept.", "sep", "9", 
                "october", "oct.", "oct", "10", 
                "november", "nov.", "nov", "11", 
                "december", "dec.", "dec", "12"
            };

            int monthIndex = -1;

            for (int i = 0; i < months.length; i++) {
                if (inputMonth.equals(months[i])) {
                    monthIndex = i;
                    break;
                }
            }

            if (monthIndex == -1) {
                System.out.println("Invalid month input. Please try again.");
                continue;
            }

            System.out.print("Enter a year: ");
            if (scanner.hasNextInt()) {
                int year = scanner.nextInt();
                if (year >= 0) {
                    int daysInMonth = getDaysInMonth(monthIndex, year);
                    System.out.println("Number of days in the specified month: " + daysInMonth);
                    break;
                }
            }
            
            System.out.println("Invalid year input. Please try again.");
            scanner.nextLine(); // Consume the invalid input
        }

        scanner.close();
    }

    // Function to calculate the number of days in a given month and year
    public static int getDaysInMonth(int monthIndex, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (isLeapYear(year) && monthIndex == 1) {
            return 29; // February in a leap year
        }
        
        return daysInMonth[monthIndex % 12];
    }

    // Function to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
