package ex41;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 David Day
 */

public class NameSorter {

    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        //the array list to hold each name in line.
        ArrayList<String> lines = new ArrayList<>();

        //reading in the file from my pc using the try method.
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\tripp\\OneDrive\\Desktop\\personal stuff\\classwork\\Fall Semester 2021\\COP 3330\\day-cop3330-assignment3\\src\\main\\java\\ex41\\exercise41_input.txt"));

            String currentLine = reader.readLine();
            //adding each line in the input file to the array created before (lines).
            while (currentLine != null) {
                lines.add(currentLine);
                currentLine = reader.readLine();
            }
            //using collections.sort() to sort the names in alphabetical order.
            Collections.sort(lines);

            //writing the new sorted array of names to the output file.
            writer = new BufferedWriter(new FileWriter("C:\\Users\\tripp\\OneDrive\\Desktop\\personal stuff\\classwork\\Fall Semester 2021\\Cop 3330\\day-cop3330-assignment3\\src\\main\\java\\ex41\\exercise41_output.txt"));
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        //closing our reader and writers.
        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
