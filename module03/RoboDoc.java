package module03;

import java.util.Scanner;

public class RoboDoc {

        public static void main(String[] args) {
        
        System.out.println("RoboDoc - Colby Oxley");
        System.out.println("What is the patient temperature? 99.6");
        System.out.print("Ask the user to enter a patient temperature");
        
        Scanner scanner = new Scanner(System.in);

        double temperature = scanner.nextDouble();

        scanner.close();

        if (temperature < 99.6) {
            
            System.out.println("The patient has no fever.");
        } else if (temperature < 102.0) {
            
            System.out.println("The patient has a low-grade fever.");
        } else if (temperature < 104.0) {
            
            System.out.println("The patient has a high-grade fever.");
        } else {
            
            System.out.println("The patient has a dangerous fever.");
        }
    }
}