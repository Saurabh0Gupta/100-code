//decimal number to octal number conversion

import java.util.Scanner;
class DeciToOctal{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=0,n=0;
        while(num>0){
            int rem=num%8;
            ans=ans+rem*(int)Math.pow(10,n);
            n++;
            num=num/8;
        }
        System.out.print(ans);
    }
}