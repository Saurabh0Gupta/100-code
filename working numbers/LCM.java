//lcm of two number using formula of lcm

import java.util.Scanner;

class LCM{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int result=lcmOfNum(num1,num2);
        System.out.print(result);
    }
    static int lcmOfNum(int num1, int num2){
        int hcf=0;
        for(int i=1; i<=num1 || i<=num2; i++){
            if(num1%i==0 && num2%i==0)
            hcf=i;
        }
        int lcm=(num1*num2)/hcf;
        return lcm;
    }
}