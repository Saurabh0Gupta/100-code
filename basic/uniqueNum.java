// unique number if condition is 2M+1 by anvesh sir

class uniqueNum{
    public static void main(String er[]){
        int arr[]={12,13,14,98,12,14,98,10,13};
        int arrLen=arr.length;
        unique(arr,arrLen);
    }
    static void unique(int arr2[],int size){
        int result=0;
        for(int i=0; i<size; i++){
            result=result^arr2[i];
        }
        System.out.print("unique number is "+result);
    }
}