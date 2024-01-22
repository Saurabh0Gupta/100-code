//Binary to octal conversion 1001=>12
import java.util.Scanner;
class BinaToOctal{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int deci=BinaryToDeci(num);
        int octal=deciToOctal(deci);
        System.out.println("decimal "+deci);
        System.out.println("octal "+octal);
    
    }
    static int BinaryToDeci(int num){
        // binary to decimal conversion
        int ans=0; 
        int i=0;
        while(num>0){
            int rem=num%10;
            ans=ans+rem*(int)Math.pow(2,i);
            i++;
            num=num/10;
        }
        return ans;
    }
    static int deciToOctal(int num){
        //decimal to octal
        int ans=0,i=0;
        while(num>0){
            int rem=num%8;
            ans=ans+rem*(int)Math.pow(10,i);
            i++;
            num=num/8;
        }
        return ans;
    }
}