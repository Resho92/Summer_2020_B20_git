package utilty;

import java.util.Scanner;

public class reverseAString {

    public static void main(String[] args) {


        // java ----->avaj

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");//cat
        String str = scan.nextLine();
        //char first_ch = str.charAt(0);
        //String last_ch = str.substring(str.length()- 1);
        String reverse = "";
        for ( int i = str.length()- 1; i >=0 ; i-- ){
            char ch = str.charAt(i) ;
            reverse += ch;
        }
        System.out.println(reverse);

    }
}
