package JavaPrograms;

public class FindMaxMinElements {
    public static void main(String args[]){
        int arr[]={2,3,45,1,22,13};
        int i;
        int size= arr.length;





        int max=arr[0];
        int min=arr[0];
        for(i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("The maximum number is " +max);
        System.out.println("The minimum number is " +min);
    }
}
