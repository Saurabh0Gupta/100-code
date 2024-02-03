// largest number in array

class LargestNum{
    public static void main(String er[]){
        int arr[]={12,34,64,235,689,654,32};
        int size=7;
        int result=largestNum(arr,size,0);

        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int largestNum(int arr[],int n){
        if(n==1)
        return arr[0];
        int maxInt=largestNum(arr,n-1);
    }

}