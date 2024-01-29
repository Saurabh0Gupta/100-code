class ArrayReverse{
    public static void main(String er[]){
        int arr[]={12,34,55,32,45};
        int left=0;
        int right=arr.length;
        while(left<right){
            int temp;
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
// class ArrayReverse{
//     public static void main(String er[]){
//         int arr[]={12,23,43,44,56};
//         for(int i=arr.length-1; i>=0; i--){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// import java.util.Scanner;

// public class ArrayReverse
// {
//    public static void main(String args[])
//    {

//      int arr[] = {10, 20, 30, 40, 50};

//      int n=arr.length;
//      for(int i=n-1; i>=0; i--)
//        System.out.print(arr[i]+" "); 
//     }
// }