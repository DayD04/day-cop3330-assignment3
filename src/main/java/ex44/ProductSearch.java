package ex44;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 David Day
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Scanner;
import java.util.ArrayList;

public class ProductSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        JSONParser jsonParser = new JSONParser();

        //try used to get the input file.
        try (FileReader reader = new FileReader("C:\\Users\\tripp\\OneDrive\\Desktop\\personal stuff\\classwork\\Fall Semester 2021\\COP 3330\\day-cop3330-assignment3\\src\\main\\java\\ex44\\exercise44_input.json")) {
            Object obj = jsonParser.parse(reader);
            JSONArray storeList = (JSONArray) obj;
            //taking in each item from the input file.
            storeList.forEach(emp -> getItem((JSONObject) emp));

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        //while loop used to continue searching for product given the characters input until a product is found.
        while (true) {
            System.out.print("What is the product name? ");
            String ask = input.next();


            //if (ask != any products within the .json file)
            //system.out.println(not in directory)
            //else print out the information of wanted product(s)
        }
    }
    //function used to get each item in the file.
    private static void getItem(JSONObject item) {
        JSONObject itemObject = (JSONObject) item.get("products");

        String name = (String) itemObject.get("name");

    }
}
