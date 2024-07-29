//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double inches = 9;
        double feet = 5;

        double centimeters = convertToCentimeters(feet, inches);

        System.out.println(feet + "'" + inches + " = " + centimeters  + " centimeters");
    }

    private static double convertToCentimeters(double feet, double inches) {
        inches += feet * 12;
        double result = convertToCentimeters(inches);
        return  result;
    }

    private static double convertToCentimeters(double inches) {
        double centimeters = inches * 2.54;
        return centimeters;
    }
}