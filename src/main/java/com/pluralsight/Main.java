package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // Create our three variables
        float floatValue = 0;
        double doubleValue = 0;
        BigDecimal bigDecimalValue = BigDecimal.ZERO;

        // First loop: 10 iterations adding 10 cents
        for (int i = 0; i < 10; i++) {

            floatValue += 0.10f;
            doubleValue += 0.10;
            bigDecimalValue = bigDecimalValue.add(new BigDecimal("0.10"));

            System.out.println(
                    floatValue + " | " +
                            doubleValue + " | " +
                            bigDecimalValue
            );

            // Reset all three variables
            floatValue = 0;
            doubleValue = 0;
            bigDecimalValue = BigDecimal.ZERO;

            // Second loop: 1000 iterations adding 19.99
            for (i = 0; i < 1000; i++) {

                floatValue += 19.99f;
                doubleValue += 19.99;
                bigDecimalValue = bigDecimalValue.add(new BigDecimal("19.99"));

            }

// Print final results
            System.out.println("\nResults after 1000 iterations:");
            System.out.println("Float: " + floatValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("BigDecimal: " + bigDecimalValue);

            // Compare the values
            System.out.println("\nComparisons:");

            System.out.println("Float == Double: " +
                    (floatValue == doubleValue));

            System.out.println("Double == BigDecimal: " +
                    (BigDecimal.valueOf(doubleValue).compareTo(bigDecimalValue) == 0));

            System.out.println("Float == BigDecimal: " +
                    (BigDecimal.valueOf(floatValue).compareTo(bigDecimalValue) == 0));
        }
    }
}
