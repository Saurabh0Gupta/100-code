//octal to decimal conversion 
//find rem and mutli*(8,1);

import java.util.Scanner;

class OctalToDeci{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int ans=0,i=0;

        while(num>0){
            int rem=num%10;
            ans=ans+rem*(int)Math.pow(8,i);
            num=num/10;
            i++;
        }
        System.out.print("Octal to decimal conversion of number is "+ans);
    }
}