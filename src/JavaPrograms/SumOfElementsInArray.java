package JavaPrograms;

import java.util.Scanner;

public class SumOfElementsInArray {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number of elements :");
        int lengthOfArray = input.nextInt();
        int []arr = new int[lengthOfArray];
        for(int i=0;i<lengthOfArray;i++){
            System.out.println("Enter the element : ");
            arr[i]=input.nextInt();
            sum=sum+arr[i];
        }

        System.out.println("The sum of the elements in the array is " +sum);
    }
}
