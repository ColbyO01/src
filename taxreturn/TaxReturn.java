package taxreturn;

import java.util.Scanner;

public class TaxReturn {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wages;

        System.out.print("Enter wages: ");
        wages = scnr.nextDouble();

        System.out.println("Social security tac: " + calculateSocialSecurityTax(wages));
        System.out.println("Medicare: " + calculateMedicareTax(wages));
        System.out.println("Income Tax: " + calculateIncomeTax(wages));
        
        for (int i = 0; i <= 50000; i += 5000) {
            System.out.println("Wages: " + i + " Taxes: " + calculateIncomeTax(i));
        }

        scnr.close();
    }

    public static double calculateSocialSecurityTax(double wages) {
        double socialSecurityTax;
        double socialSecurityCap = 147000;
        if (wages < socialSecurityCap) {
            socialSecurityTax = wages * 0.062;
        } else {
            socialSecurityTax = socialSecurityCap * 0.062;
        }
        return socialSecurityTax;
        }

        public static double calculateMedicareTax(double wages) {
            double medicareTax;
            medicareTax = Math.min(wages, 200000) * 0.0145;
            return medicareTax;
        }

        public static double calculateIncomeTax(double wages) {
            double IncomeTax = 0;
            double taxable = wages - 5000;
            double tax10 = 0;
            double tax20 = 0;
            double tax50 = 0;

            if (taxable > 0) {
                tax10 = Math.min(taxable, 10000) * 0.1;
            }
            if (taxable > 10000) {
                tax20 = Math.min(taxable, 20000) - 10000 * 0.2;
            }
            if (taxable > 20000) {
                tax50 = (taxable - 20000) * 0.5;
            }
            System.err.println("Wages: " + wages + " tax10 " + tax10 + " tax20 " + " tax20 " + tax50);
            IncomeTax = tax10 + tax20 + tax50;

            return IncomeTax;
        }
    }