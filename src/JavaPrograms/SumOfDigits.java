package JavaPrograms;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n, sum=0,temp;
        System.out.println("enter the number : ");
        n = input.nextInt();

        //using for loop
        for(int i=0;i<=n;i++){
            temp=n%10;
            sum=sum+temp;
            n=n/10;
        }

        //using while loop
        while(n!=0){
            temp=n%10;
            sum=sum+temp;
            n=n/10;
        }

        System.out.println("Sum of the digits : "+sum);
    }
}
