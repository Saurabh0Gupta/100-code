//abundant number in those number whose factor's sum is grater than given input

class Code_27{
    public static void main(String er[]){
        int num=11;
        if(isAbundant(num))
        System.out.print("yes abundant number");
        else
        System.out.print("no it's not");
    }
    static boolean isAbundant(int n){
        int sum=0;
        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n<sum)
        return true;
        else
        return false;
    }
}