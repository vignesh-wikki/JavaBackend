/*Define an enum Day with values for all days of the week.
Write a program to print a message like "It's a weekday" or "It's a weekend" based on the day.
 */

package Day5.Enum.BasicEnumUsage;

enum Day {
    MONDAY("It's a weekday"),
    TUESDAY("It's a weekday"),
    WEDNESDAY("It's a weekday"),
    THRUSDAY("It's a weekday"),
    FRIDAY("It's a weekday"),
    SATURDAY("It's a weekend"),
    SUNDAY("It's a weekend");

    private final String description;

    Day(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}

public class WeekDays {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDescription());
        }

        Day day = Day.SUNDAY;

        System.out.println(day.getDescription());

    }

}
