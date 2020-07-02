package com.company;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main (String[] args)
    {

    }
    String path = "people.simple";

    public void printPeopleDetails(){ //I didn't have it take a param here bc to me it made more sense not to...?
        File dir = new File(path);
        File[] directoryListing = dir.listFiles();
        if (directoryListing != null) {
            for (File child : directoryListing) {
                try {
                    FileReader reader = new FileReader(child);
                    BufferedReader bufferedReader = new BufferedReader(reader);
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println(line);
                    }
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("There was an issue with the directory.");
        }
    }

    public void printEmployee(){
        //define location of record
        //iterate over each file in given path
        //create employee object for each file to store data
        //print the toString of each created employee
    }

}