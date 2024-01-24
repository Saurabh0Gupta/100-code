//sum of two fraction number

import java.util.Scanner;

class fractionSum{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first num value");
        int num1=sc.nextInt();
        System.out.println("enter first den value");
        int den1=sc.nextInt();
        System.out.println("enter second num value");
        int num2=sc.nextInt();
        System.out.println("enter second den value");
        int den2=sc.nextInt();
        int num=0;
        int den;
        if(den1==den2){
            num=num1+num2;
            den=den1;
            System.out.println(num+"/"+den);
            return;
        }
        den=lcm(den1, den2);
        int newnum1=num1*(den/den1);
        int newnum2=num2*(den/den2);
        int newnum=newnum1+newnum2;
        for(int i=1; i<=newnum || i<=den; i++){
            if(newnum%i==0 && den%i==0){
                newnum=newnum/i;
                den=den/i;
            }
        }
        System.out.println(newnum+"/"+den);
    }
    static int lcm(int den1, int den2){
        int hcf=0;
        for(int i=1; i<=den1 || i<=den2; i++){
            if(den1%i==0 && den2%i==0){
                hcf=i;
            }
        }
        return (den1*den2)/hcf;
    
    }
}