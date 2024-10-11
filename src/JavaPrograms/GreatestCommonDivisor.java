package JavaPrograms;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int findgcd(int a,int b){
        while(b!=0){
            int temp = b;
            b=a%b;
            a= temp;
        }
        return a;

    }
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int b = scanner.nextInt();
        int gcd=findgcd(a,b);
        System.out.println("The GCD of " +a+ " and " +b+ "is : " +gcd);

    }
}
