package exercises;

import java.util.Scanner;

public class OneFour {
    public static void main(String[] args){
        String sentence  = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String searchTerm;
        Boolean found;
        Scanner input = new Scanner(System.in);

        System.out.println(sentence);
        System.out.print("Enter the search term; Press return: ");
        searchTerm = input.nextLine();

        found = sentence.toLowerCase().contains(searchTerm.toLowerCase());
        System.out.println(found);
    }
}
