//Harshad number is those number whose sum of digit of given number is divide by origin given number
class Code_26{
    public static void main(String er[]){
        int num=35;
        if(isHarshad(num)){
            System.out.print("yes harshad number");
        }else{
            System.out.print("no it's not");
        }
    }
    static boolean isHarshad(int n){
        int sum=0;
        int copy=n;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            n =n/10;
        }
        if(copy%sum==0)
        return true;
        else
        return false;
    }
}