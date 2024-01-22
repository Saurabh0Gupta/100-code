//decimal to binary number such as 10=>1010

import java.util.Scanner;

class DeciToBinary{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=0;
        int i=0;
        while(num>0){
            int rem=num%2;
            ans=rem*(int)Math.pow(10,i)+ans;
            num=num/2;
            i++;
        }
        System.out.print(ans);
    }
}