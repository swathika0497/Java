package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber {
public void PrimeNumber(int number){
    int i, m=0,flag=0;
    m = number/2;
    if(number==0||number==1){
        System.out.println("It is not a prime number");
    }
    else{
        for(i=2;i<=m;i++){
            if(number%i==0){
                System.out.println("It is not a prime number");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("It is a prime number");
        }
    }

}
public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);// object of the class Scanner to read the input

    System.out.println("Enter the number :" );
      int number = scanner.nextInt(); // read the number and store it in number
            PrimeNumber p = new PrimeNumber(); // create an object for the prime method

        p.PrimeNumber(number); //call primenumber method along with sending number as argument
}


}
