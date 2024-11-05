import java.util.Scanner;

public class TemperatureConverter {      //Part 4: Temperature Converter with Multiple Scales
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature;
        int scale;

        System.out.print("Enter temperature: ");
        temperature = scanner.nextDouble();
        System.out.print("Enter scale (1 for Celsius, 2 for Fahrenheit, 3 for Kelvin): ");
        scale = scanner.nextInt();

        switch (scale) {
            case 1:
                convertFromCelsius(temperature);
                break;
            case 2:
                convertFromFahrenheit(temperature);
                break;
            case 3:
                convertFromKelvin(temperature);
                break;
            default:
                System.out.println("Invalid scale.");
        }

        scanner.close();
    }

    private static void convertFromCelsius(double celsius) {
        System.out.printf("Fahrenheit: %.2f, Kelvin: %.2f%n", celsius * 9/5 + 32, celsius + 273.15);
    }

    private static void convertFromFahrenheit(double fahrenheit) {
        System.out.printf("Celsius: %.2f, Kelvin: %.2f%n", (fahrenheit - 32) * 5/9, (fahrenheit - 32) * 5/9 + 273.15);
    }

    private static void convertFromKelvin(double kelvin) {
        if (kelvin < 0) {
            System.out.println("Temperature in Kelvin cannot be negative.");
            return;
        }
        System.out.printf("Celsius: %.2f, Fahrenheit: %.2f%n", kelvin - 273.15, (kelvin - 273.15) * 9/5 + 32);
    }
}
