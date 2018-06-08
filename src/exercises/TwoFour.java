package exercises;

/*
HashMap: Make a program similar to GradebookHashMap, but which takes in students names and ID numbers
(as integers) instead of names and grades. In this case, however, the keys should be integers (the IDs)
and the values should be strings (the names). Modify the roster printing code accordingly.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoFour {

    public static void main(String[] args){
        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;
        int studentId;

        System.out.println("Enter the students; Press Enter when finished: ");

        do{
            System.out.print("Student Name: ");
            studentName = input.nextLine();

            if(!studentName.equals("")){
                System.out.print("Student ID: ");
                studentId = input.nextInt();

                students.put(studentName, studentId);
                input.nextLine();
            }

        }while(!studentName.equals(""));

        System.out.println("-------------------------------------------------");
        System.out.println("Class roster:");
        for(Map.Entry<String, Integer> student: students.entrySet()){
            System.out.println(student.getKey() + " - " + student.getValue());
        }
    }
}
