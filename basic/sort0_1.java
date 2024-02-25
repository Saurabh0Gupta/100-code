class sort0_1{
    public static void main(String er[]){
        int arr[]={0,1,0,1,1,0,1,1};
        int arrLen=arr.length;
        sort(arr,arrLen);
        // printing(arr,arrLen);
    }
    static void sort(int arr2[], int size){
        int p=arr2[0];
        int q=size-1;
        while(p==0){
            p++;
        }
        while(q==1){
            q--;
        }
        if(p<q){
            int temp;
            temp=p;
            p=q;
            q=temp;
            p++;
            q--;
        }
        for(int i=0; i<size; i++){
            System.out.print(arr2[i]);
        }
    }
    // static void printing(int arr3[],int size){
        
    // }
}