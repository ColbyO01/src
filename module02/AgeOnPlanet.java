package module02;

import java.util.Scanner;

public class AgeOnPlanet {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double earthAge = 365.26;
        double saturnAge = 29.456;
        double jupiterAge = 11.862;
        double venusAge = 224.68;
        double neptuneAge = 164.81;
        double marsAge = 686.98;
        double mercuryAge = 87.96;
        double uranusAge = 84.07;
        double plutoAge = 247.7;
        
        System.out.println("Ask the user to enter an Earth age in years");
        
        double userAge = scnr.nextDouble();
        
        double saturnAgeOnPlanet = userAge / saturnAge;
        double jupiterAgeOnPlanet = userAge / jupiterAge;
        double venusAgeOnPlanet = userAge / venusAge;
        double neptuneAgeOnPlanet = userAge / neptuneAge;
        double marsAgeOnPlanet = userAge / marsAge;
        double mercuryAgeOnPlanet = userAge / mercuryAge;
        double uranusAgeOnPlanet = userAge / uranusAge;
        double plutoAgeOnPlanet = userAge / plutoAge;

        System.out.println("Your age on Saturn: " + saturnAgeOnPlanet);
        System.out.println("Your age on Jupiter: " + jupiterAgeOnPlanet);
        System.out.println("Your age on Venus: " + venusAgeOnPlanet);
        System.out.println("Your age on Neptune: " + neptuneAgeOnPlanet);
        System.out.println("Your age on Mars: " + marsAgeOnPlanet);
        System.out.println("Your age on Mercury: " + mercuryAgeOnPlanet);
        System.out.println("Your age on Uranus: " + uranusAgeOnPlanet);
        System.out.println("Your age on Pluto: " + plutoAgeOnPlanet);
        
    }
}
