package question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteBackWards {
    public static void main(String[] args) {
        /*
          Get name from user
          Write the name you received backwards.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println(name);


        ArrayList<Character> characterList = stringToArrayList(name);
        System.out.println(characterList.size());

        for (int i = characterList.size()-1; i >= 0; i--) {

            Character backWards = characterList.get(i);
            System.out.print(backWards);
        }


        scanner.close();


    }

    public static ArrayList<Character> stringToArrayList(String str) {
        ArrayList<Character> characterList = new ArrayList<>();
        for (char c : str.toCharArray()) {
            characterList.add(c);
        }
        return characterList;
    }
}
