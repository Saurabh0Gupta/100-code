// HCF of two number in java highest common factor 
import java.util.Scanner;
class HCF{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        HCF h=new HCF();
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int result=h.hcfOfNum(num1,num2);
        System.out.print(result);
    }
    int hcfOfNum(int num1, int num2){
        int hcf=0;
        for(int i=1; i<=num1 || i<=num2; i++){
            if(num1%i==0 && num2%i==0)
            hcf=i;
        }
        return hcf;
    }
}