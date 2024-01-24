//we can also use the formula of combination to find number handshakes num * (num-1) / 2

//below is my own solution
import java.util.Scanner;

class handshakes{
    public static void main(String er[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int hand=0;
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                hand++;
            }
        }
        System.out.print(hand);
    }
}