// 12  34  54  22  45
// m
//             mm

class secondSmall{
    public static void main(String er[]){
        int arr[]={12,34,54,22,13};
        int min=arr[0];
        int smin=9999;
        for(int i=1; i<5; i++){
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }else if(arr[i]!=min && arr[i]<smin){
                smin=arr[i];
            }
           
        }
        System.out.println("second largest minimum number is "+smin);
    }
}

