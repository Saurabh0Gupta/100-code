////friendly pair
class Code_28{
    public static void main(String er[]){
        int arr[]={6,2};
        if(isFriendly(arr,2))
        System.out.print("yes fri");
        else
        System.out.print("no not's");
    }
    static boolean isFriendly(int arr[],int size){
        int count=0;
        for(int i=0; i<size; i++){
            int sum=0;
            for(int j=1; j<=arr[i]/2; j++){
                if(arr[i]%j==0){
                    sum=sum+j;
                    System.out.print(sum);
                }
            }
            if(arr[i]==sum){
                count++;
            }
        }
        if(count>0)
        return false;
        else
        return true;
    }
}