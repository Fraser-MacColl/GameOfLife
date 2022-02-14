package Util;

import Util.ConsoleColour.Control;
import Util.ConsoleColour.Foreground;

import java.util.Scanner;


public class Input {

    private static Scanner scanner = new Scanner(System.in);
    private static String input;
    private static boolean valid;

    public static int getInt(String msg) {
        /*
         Takes a message string
         Takes and validates input
         Returns input int
        */

        System.out.print(msg);

        // Initial input
        System.out.print(TextConstants.INPUT_LINE);
        input = scanner.nextLine();
        valid = isValidInt(input);


        // Validation
        while (!valid) {
            System.out.println(TextConstants.INVALID_INPUT);
            System.out.print(TextConstants.INPUT_LINE);
            input = scanner.nextLine();
            valid = isValidInt(input);
        }

        return Integer.parseInt(input);
    }

    public static boolean isValidInt(String input) {
        // Is number
        try { Integer.parseInt(input); }
        catch (Exception e) { return false; }

        return true;
    }

    public static Double getDouble(String msg) {
        /*
         Takes a message string
         Takes and validates input
         Returns input double
        */

        System.out.print(msg);

        // Initial input
        System.out.print(TextConstants.INPUT_LINE);
        input = scanner.nextLine();
        valid = isValidDouble(input);


        // Validation
        while (!valid) {
            System.out.println(TextConstants.INVALID_INPUT);
            System.out.print(TextConstants.INPUT_LINE);
            input = scanner.nextLine();
            valid = isValidDouble(input);
        }

        return Double.parseDouble(input);
    }

    public static boolean isValidDouble(String input) {
        // Is number
        try { Double.parseDouble(input); }
        catch (Exception e) { return false; }

        return true;
    }



    public static int getFromOptions(String message, String... options) {
        /*
         Takes a message string and a number of options
         Displays in an intuitive manner
         Takes and validates input
         Returns option number
        */

        // Print message + options
        System.out.println(message);
        for (int i = 0; i < options.length; i++) {
            System.out.println(Foreground.LIGHT_GREEN+(i +1) + " - " + Foreground.GREEN+options[i]);
        }
        System.out.print(Control.RESET);


        // Initial input
        System.out.print(TextConstants.INPUT_LINE);
        input = scanner.nextLine();
        valid = isValidOption(input, options);


        // Validation
        while (!valid) {
            System.out.print(TextConstants.INVALID_INPUT);
            System.out.print(TextConstants.INPUT_LINE);
            input = scanner.nextLine();
            valid = isValidOption(input, options);
        }

        return Integer.parseInt(input);
    }

    private static boolean isValidOption(String input, String[] options) {
        int intInput;

        // Is number
        try { intInput = Integer.parseInt(input); }
        catch (Exception e) { return false; }

        // In range >0 and no greater than number of options
        if (intInput > options.length) return false;
        return intInput > 0;
    }

}
