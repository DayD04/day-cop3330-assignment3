package ex45;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 David Day
 */

public class WordFinder {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String contents;
        StringBuilder sb = new StringBuilder();

        //start with creating a path to the input and reading it into a String
        Path exerciseInput = Path.of("C:\\Users\\tripp\\OneDrive\\Desktop\\personal stuff\\classwork\\Fall Semester 2021\\COP 3330\\day-cop3330-assignment3\\src\\main\\java\\ex45\\exercise45_input.txt");
        contents = Files.readString(exerciseInput);
        sb.append("\n").append(contents);

        //asking for the name of the output file
        System.out.print("What would you like the name of the output file to be? ");
        String name = input.next();

        //replacing all "utilize" and "utilizes" with "use" and "uses" respectively.
        String result = sb.toString();
        result = result.replaceAll("\\butilize\\b", "use");
        result = result.replaceAll("\\butilizes\\b", "uses");

        //creating the file of the selected name, and writing the resulting changes to it.
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\tripp\\OneDrive\\Desktop\\personal stuff\\classwork\\Fall Semester 2021\\COP 3330\\day-cop3330-assignment3\\src\\main\\java\\ex45\\" + name + ".txt"));
        bw.write(result);
        bw.close();
    }
}
