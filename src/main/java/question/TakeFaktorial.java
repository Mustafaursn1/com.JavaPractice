package question;

import java.util.Scanner;

public class TakeFaktorial {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int num=scanner.nextInt();
        faktoriyel(num);




    }
    public static int faktoriyel(int n){


      if(n<0){

          throw new  IllegalArgumentException("Factorial is not defined for negative numbers.");
      }
        int   faktoriyel=1;
      for(int i=1;i<=n;i++){

          faktoriyel*=i;
      }
        System.out.println("faktoriyel: "+faktoriyel);
      return faktoriyel;

    }
}
