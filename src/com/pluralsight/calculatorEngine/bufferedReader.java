package com.pluralsight.calculatorEngine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader inputData = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter New Text");
        String text = inputData.readLine();
        System.out.println("Input: " + text);

    }
}
