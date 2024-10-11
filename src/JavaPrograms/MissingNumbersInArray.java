package JavaPrograms;

public class MissingNumbersInArray {
    public static void findmissingnumber(int arr[],int max){
        int i, flag=0;
        for(i=1;i<max;i++){
            flag=0;
            for(int n:arr){
                if(n==i){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i);
            }
        }

    }
    public static void main(String args[]){
        int arr[]={1,4,5,6,8};
        int max=8;
        System.out.println("The missing numbers are ");
        findmissingnumber(arr,max);
    }
}
