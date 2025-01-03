/*Create an enum Season with values WINTER, SPRING, SUMMER, and FALL. Add a method getAverageTemperature() to return an average temperature for each season.
*/

package Day4.Enum.EnumWithMethods;

enum Season {
    WINTER(30.67),
    SPRING(35.98),
    SUMMER(40.99),
    FALL(34.85);

    private final double temperature;

    Season(double temperature) {
        this.temperature = temperature;
    }

    public double getAverageTemperature() {
        return temperature;
    }

}

public class EnumMethods {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season + ": " + season.getAverageTemperature());
        }

        Season season = Season.WINTER;
        System.out.println(season.getAverageTemperature());
    }
}
