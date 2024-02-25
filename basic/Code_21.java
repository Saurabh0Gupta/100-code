import java.util.Scanner;

class Code_21{
    public static void main(String ag[]){
        int num=90;
        for(int i=2; i<=48; i++){
            if(isPrime(i)==1){
                int x=num;
                while(x%i==0){
                    System.out.print(i+" ");
                    x=x/i;
                }
            }
        }
    }
    static int isPrime(int n){
        for(int i=2; i<n; i++ ){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
}