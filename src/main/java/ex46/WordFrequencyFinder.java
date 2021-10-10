package ex46;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 David Day
 */

public class WordFrequencyFinder {

    public static void main(String[] args) {

        //path to the input file
        Path path = Paths.get("C:\\Users\\tripp\\OneDrive\\Desktop\\personal stuff\\classwork\\Fall Semester 2021\\COP 3330\\day-cop3330-assignment3\\src\\main\\java\\ex46\\exercise46_input.txt");

        try {
            String text = Files.readString(path);

            //searches for consecutive letters
            Pattern patterns = Pattern.compile("[a-z]+");
            Matcher matches = patterns.matcher(text);

            TreeMap<String, Integer> freq = new TreeMap<>();

            int longest = 0;

            //while loop to find the next word in the string
            while (matches.find()) {
                String word = matches.group();
                int letters = word.length();

                if (letters > longest) {
                    longest = letters;
                }
                if (freq.containsKey(word)) {
                    freq.computeIfPresent(word, (w, c) -> c + 1);
                }
                else {
                    freq.computeIfAbsent(word, (w) -> 1);
                }
            }
            //printing each word's count
            String format = "%-" + longest + "s = %2d%n";
            freq.forEach((k, v) -> System.out.printf(format, k, v));

        }
        catch (IOException xIo) {
            xIo.printStackTrace();
        }
    }
}
