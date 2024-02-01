class smallest{
    public static void main(String er[]){
        int arr[]={122,34,53,21,34};
    int min=0;
        for(int i=1; i<5; i++){
            if(arr[min]>arr[i]){
                min=i;
            }
        }
        System.out.println(arr[min]+" is manimun number");
    }
}