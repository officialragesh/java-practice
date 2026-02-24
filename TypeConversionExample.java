

import java.util.Scanner;

public class TypeConversionExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        double convertedValue = (double) num;

        System.out.println("Converted value = " + convertedValue);
    }
}
