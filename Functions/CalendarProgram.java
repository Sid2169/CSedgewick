public class CalendarProgram {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java CalendarProgram <month> <year>");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);

        // Determine the day of the week for the first day of the month
        int dayOfWeek = getDayOfWeek(year, month, 1);

        // Print the calendar header
        System.out.println(" S  M Tu  W Th  F  S");

        // Print leading spaces
        for (int i = 0; i < dayOfWeek; i++) {
            System.out.print("   ");
        }

        // Print the days of the month
        for (int day = 1; day <= getDaysInMonth(year, month); day++) {
            System.out.printf("%2d ", day);
            if ((dayOfWeek + day) % 7 == 0) {
                System.out.println();
            }
        }
    }

    // Returns the day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    private static int getDayOfWeek(int year, int month, int day) {
        int adjustedMonth = month < 3 ? month + 12 : month;
        int adjustedYear = month < 3 ? year - 1 : year;
        int century = adjustedYear / 100;
        int yearOfCentury = adjustedYear % 100;

        int dayOfWeek = (day + 13 * (adjustedMonth + 1) / 5 + yearOfCentury + yearOfCentury / 4 + century / 4 + 5 * century) % 7;
        return (dayOfWeek + 5) % 7; // Adjust to match Java's convention (0 = Sunday)
    }

    // Returns the number of days in the specified month
    private static int getDaysInMonth(int year, int month) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    // Checks if the given year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

