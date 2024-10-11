package JavaPrograms;

import java.util.Scanner;

public class Palindrome {

    public void Palindrome(String originalString) {

        String lowerCaseString=originalString.toLowerCase();
        String reversedString= new StringBuilder(lowerCaseString).reverse().toString();
        if(reversedString.equals(lowerCaseString)){
            System.out.println(originalString + " is a prime number");

                    }
        else{
            System.out.println(originalString + " is not a prime number");
        }
    }
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        Palindrome p = new Palindrome();
        System.out.println("Enter the string : ");
        String originalString = scanner.nextLine();
        p.Palindrome(originalString);
    }
}
