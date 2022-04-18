package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double inchesCalculated = calcFeetToInches(12);

        double centimetersCalculated = calcInchesToCentimeters(inchesCalculated);

        System.out.println("Number of inches: " + inchesCalculated);
        System.out.println("Number of centimeters: " + centimetersCalculated);
    }

    public static double calcFeetToInches(double feet) {
        double inches = feet * 12;
        return inches;
    }

    public static double calcInchesToCentimeters(double inches) {
        double centimeters = inches * 2.54;
        return centimeters;
    }
}
