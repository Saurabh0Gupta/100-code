//binary number decimal number 1010=> 10

import java.util.Scanner;

class BinaryToDeci{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int deci=0,n=0;

        while(num>0){
            int temp=num%10;
            deci=deci+temp*(int)Math.pow(2,n);
            num=num/10;
            n++;
        }
        System.out.print("decimal number of given binary number is "+deci);
    }
}