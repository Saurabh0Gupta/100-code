class largest{
    public static void main(String er[]){
        int arr[]={12,34,53,21,34};
    int max=0;
        for(int i=0; i<5; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        System.out.println(arr[max]+" is maximum number");
    }
}