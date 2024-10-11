package JavaPrograms;

import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]){
        String str = new String();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string : ");
        str = input.nextLine();
        String reversedString= new StringBuilder(str).reverse().toString();
        System.out.println(" The reversed string is " +reversedString);

    }
}
