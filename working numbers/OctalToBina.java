//octal to binary number
import java.util.Scanner;
class OctalToBina{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int deci=OctalToDeci(num);
        int bina=DeciToBina(deci);
        System.out.println("decimal "+deci);
        System.out.println("binary "+bina);
        
    }
    static int OctalToDeci(int num){
        int ans=0,i=0;
        while(num>0){
           int rem=num%10;
           ans=ans+rem*(int)Math.pow(8,i);
           num=num/10;
           i++;
        }
        return ans;
    }
    static int DeciToBina(int num){
        int ans=0,i=0;
        while(num>0){
            int rem=num%2;
            ans=ans+rem*(int)Math.pow(2,i);
            i++;
            num=num/2;
        }
        return ans;
    }
}