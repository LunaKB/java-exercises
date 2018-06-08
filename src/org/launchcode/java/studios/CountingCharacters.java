package org.launchcode.java.studios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.rmi.server.ExportException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    static HashMap<Character, Integer> charIntHashMap = new HashMap<>();

    public static void main(String[] args){
        String data = "";
        String choice;
        Scanner input = new Scanner(System.in);

        System.out.print("Press D to use programmed data; S to enter your own; F to read from a file: ");
        choice = input.nextLine();

        switch(choice)
        {
            case "D":
            case "d":
                data = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan " +
                        "sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent " +
                        "quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, " +
                        "non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat " +
                        "eget massa. Donec nec velit non ligula efficitur luctus.";
                break;
            case "S":
            case "s":
                data = input.nextLine();
                break;
            case "F":
            case "f":
                String fileName = input.nextLine();
                try{
                    FileReader reader = new FileReader(fileName);
                    BufferedReader bufferedReader = new BufferedReader(reader);
                    String line;
                    while((line = bufferedReader.readLine()) != null){
                        data += line;
                    }
                }
                catch (Exception ex){
                    System.out.println(ex.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println(data);
        CountCharactersInString(data);
        PrintResults();
    }

    static void CountCharactersInString(String sample){
        char[] charSample = sample.toCharArray();

        for(int a = 0; a < charSample.length; a++){
            char currentChar = charSample[a];
            if(charIntHashMap.containsKey(currentChar)){
                int count = charIntHashMap.get(currentChar);
                charIntHashMap.replace(currentChar, ++count);
            }
            else{
                charIntHashMap.put(currentChar, 1);
            }
        }
    }

    static void PrintResults(){
        for(Map.Entry<Character, Integer> character: charIntHashMap.entrySet()){
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
