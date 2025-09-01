// Java program to use method floor() for rounding number down to the nearest integer

package com.mymath;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Printing rounding down numbers
        System.out.println(Math.floor(10.5)); // Output: 10.0
        System.out.println(Math.floor(10.4)); // Output: 10.0
        System.out.println(Math.floor(10.6)); // Output: 10.0
        System.out.println(Math.floor(0.4)); // Output: 0.0
        System.out.println(Math.floor(7)); // Output: 7.0
        System.out.println(Math.floor(-3.6)); // Output: -4.0
        System.out.println(Math.floor(-4.9)); // Output: -5.0
    }
}