package module03;

import java.util.Scanner;

public class Seasons {
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seasons - Colby Oxley");
        System.out.print("Enter the name of the month and day:");
        String input = scanner.nextLine().trim();
        
        String[] parts = input.split(" ");

        String month = parts[0];
        int day = Integer.parseInt(parts[1]);

        scanner.close();

        if (isValidMonth(month) && isValidDay(month, day)) {
        String season = determineSeason(month, day);
        System.out.println("Season is: " + season);
        } else {
        System.out.println("Invalid");
    }
}
        public static boolean isValidMonth(String month) {
        String[] validMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (String validMonth : validMonths) {
        if (month.equalsIgnoreCase(validMonth)) {
        return true;
    }
}
        return false; }
        public static boolean isValidDay(String month, int day) {
        if (day < 1) {
        return false;
}
        switch (month.toLowerCase()) {
        case "january":case "march":case "may":case "july":case "august":case "october":case "december":
        return day <= 31;case "april":case "june":case "september":case "november":
        return day <= 30;
        case "february":
        return day <= 29;
        default: return false;
    }
}
        public static String determineSeason(String month, int day) {
        if ((month.equalsIgnoreCase("march") && day >= 20) || (month.equalsIgnoreCase("april") || month.equalsIgnoreCase("may")) || (month.equalsIgnoreCase("june") && day <= 20)) {
        return "Spring";
        } else if ((month.equalsIgnoreCase("june") && day >= 21) || (month.equalsIgnoreCase("july") || month.equalsIgnoreCase("august")) || (month.equalsIgnoreCase("september") && day <= 21)) {
        return "Summer";
        } else if ((month.equalsIgnoreCase("september") && day >= 22) || (month.equalsIgnoreCase("october") || month.equalsIgnoreCase("november")) || (month.equalsIgnoreCase("december") && day <= 20)) {
        return "Fall";
        } else {
        return "Winter";
        }
    }
}