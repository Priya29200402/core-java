package com.xworkz.practice;

import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
        public static void main(String[] args) {
            String data = "Hello, this is my first file writing program!";

            try {
                FileWriter writer = new FileWriter("output.txt");
                writer.write(data);
                writer.close();
                System.out.println("Data written successfully!");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
}

