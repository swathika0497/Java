package JavaPrograms;

import java.util.Arrays;

public class isAnagram {
    public static void main(String args[]){
        String str1 = "peek";
        String str2 = "keep";
        boolean status = true;
        if(str1.length()!= str2.length()){
            status = false;
        }
        else{
            char[] ArrayStr1 = str1.toLowerCase().toCharArray();
            char[] ArrayStr2 = str1.toLowerCase().toCharArray();
            Arrays.sort(ArrayStr1);
            Arrays.sort(ArrayStr2);
           status= Arrays.equals(ArrayStr1,ArrayStr2);
        }
        if(status){
            System.out.println("It is anagram");
        }
        else{
            System.out.println("Not an anagram");
        }
    }
}
