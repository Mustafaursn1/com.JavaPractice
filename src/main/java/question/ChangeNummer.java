package question;

import java.util.Scanner;

public class ChangeNummer {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int num1 = scan.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int num2 = scan.nextInt();
        changeNummer(num1,num2);


    }
    public static void changeNummer(int x,int y){
        //degismeden önce
        System.out.println("x:"+x+"\t"+"y:"+y);

        int temp=x;
         x=y;

         y=temp;

         //degisimden sonra
        System.out.println("x:"+x+"\t"+"y:"+y);











    }

}
