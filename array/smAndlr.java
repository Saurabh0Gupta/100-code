class smAndlr{
    public static void main(String er[]){
        int arr[]={12,34,54,23,66,3};
        int small=smallestNum(arr,6);
        int lar=largestNum(arr,6);
        System.out.println("smallest number in an array is "+arr[small]);
        System.out.println("largest number in an array is "+arr[lar]);
    }
    static int largestNum(int arr[], int n){
        int max=0;
        for(int i=1; i<n; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
     static int smallestNum(int arr[], int n){
        int min=0;
        for(int i=1; i<n; i++){
            if(arr[min]>arr[i]){
                min=i;
            }
        }
        return min;
    }
}

// class secondSmall{
//     public static void main(String er[]){
//         int arr[]={12,3,5,22,45};
//         int min=0;
//         int smin=0;
//         for(int i=1; i<5; i++){
//             if(arr[min]>arr[i]){
//                 smin=min;
//                 min=i;
//             }else if(arr[min]<arr[i] && arr[i]>arr[smin])
//             smin=i;
//         }
//         System.out.println("largest  number is "+arr[smin]);
//         System.out.println("minimum number is "+arr[min]);
//     }
// }

