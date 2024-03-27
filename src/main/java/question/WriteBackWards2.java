package question;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class WriteBackWards2 {
    public static void main(String[] args) {

        //verilen bir String ifadeyi tersten yazdirmak

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir String ifade giriniz");
        String s = scanner.nextLine();

        stringToArrayList(s);

        List<Character> charList=stringToArrayList(s);

        for (int i=charList.size()-1;i>=0;i--){
            System.out.print(charList.get(i));

        }

        System.out.println("===========");

        System.out.println(charList);


    }

    public static ArrayList<Character> stringToArrayList(String str) {

        ArrayList<Character> characterList = new ArrayList<>();
        for (char c : str.toCharArray()) {
            characterList.add(c);
        }
        return characterList;
    }

    public static void sonHarfReverse(List<String> list) {
        list.
                stream().
                sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).
                forEach(System.out::println);


    }


}
