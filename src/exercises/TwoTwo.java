package exercises;

/*
ArrayList and Strings: Write a static method to print out each word in a list that has exactly 5 letters.
 */

import java.util.ArrayList;

public class TwoTwo {

    public static void main(String[] args){
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("asdfd");
        wordList.add("kldskldsk");
        wordList.add("ph");
        wordList.add("knlsdfnkl");
        wordList.add("dklw;");
        wordList.add("vlekd");
        wordList.add("adsihifasd");
        wordList.add("s");
        wordList.add("dod");
        wordList.add("paskmd");
        wordList.add("borgouize");

        System.out.println("Here are the words with 5 letters: ");
        Print5LetterWords(wordList);
    }

    static void Print5LetterWords(ArrayList<String> strings){
        for(int a = 0; a < strings.size(); a++){
            if(strings.get(a).length() == 5)
                System.out.println(strings.get(a));
        }
    }

}
