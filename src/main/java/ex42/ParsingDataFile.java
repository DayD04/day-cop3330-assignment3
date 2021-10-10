package ex42;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 David Day
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ParsingDataFile {

    public static void main(String[] args) {
        //the top of the chart, separating the Last name, the First name, and the Salary of each person.
        System.out.println("Last       First       Salary");
        System.out.println("-------------------------------");

        //try is used to get the input file and space each section out neatly when printing.
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("exercise42_input.txt"))) {
            String DELIMITER = ",";

            String line;
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(DELIMITER);
                System.out.println(String.join("       ", columns));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
