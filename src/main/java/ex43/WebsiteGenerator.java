package ex43;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 David Day
 */

import java.io.*;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WebsiteGenerator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //asking and taking each requested item (site name, author, if we want javascript and/or css):
        System.out.print("Site name: ");
        String name = input.nextLine();

        System.out.print("Author: ");
        String author = input.nextLine();

        System.out.print("Do you want a folder for JavaScript? ");
        String javaScript = input.next();

        System.out.print("Do you want a folder for CSS? ");
        String css = input.next();

        //where we create the site and directories using jsoup
        String HTMLString = "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<title>JSoup Example</title>"
                + "</head>"
                + "<body>"
                + "<table><tr><td><h1>HelloWorld</h1></tr>"
                + "</table>"
                + "</body>"
                + "</html>";

        Document html = Jsoup.parse(HTMLString);
        html.title(name);

        //returning the website name and directories.
        System.out.println("Created .website/" + name);
        System.out.println("Created .website/" + name + "/index.html");
        if (javaScript.equals("y")) {
            System.out.println("Created .website/" + name + "/js/");
        }
        if (css.equals("y")) {
            System.out.println("Created .website/" + name + "/css/");
        }
    }
}
