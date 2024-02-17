package module02;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            double num1;
            double sum;
            System.out.println("Enter temperature in degrees Fahrenheit");
            num1 = scnr.nextDouble();
            sum = num1;
            // the sum of ## and ## is ##
            System.out.println("Temperature - Colby Oxley");
            System.out.println("Enter Temperature in degrees Fahrenheit: 101.5");
            System.out.println("101.5 degrees Fahrenheit = ");
            double celsiusDegrees;
            double kelvinDegrees;
            double delisleDegrees;
            double romerDegrees;
            celsiusDegrees = (5.0/9.0);
            kelvinDegrees = (5.0/9.0 + 273.15);
            delisleDegrees = (3.0/2.0);
            romerDegrees = (7.0/24.0 + 7 + 1.0/2.0);
            double value1 = 5.0/9.0;
            double value2 = 5.0/9.0 + 273.15;
            double value3 = 3.0/2.0;
            double value4 = 7.0/24.0 + 7 + 1.0/2.0;
            double result = value1 / value2;
            System.out.println("  " + result + " " + "degrees Celsius");
            System.out.println("  " + result + " " + "kelvins");
            System.out.println("  " + result + " " + "degrees Delisle");
            System.out.println("  " + result + " " + "degrees Romer");
    }
}
