import java.util.Scanner;
class Code_7{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3)
        System.out.println("num1 is greatest one number");
        else if(num2>num1 && num2>num3)
        System.out.println("num2 is greatest number");
        else if(num3>num1 && num3>num2)
        System.out.println("num3 is gratest number");
        else
        System.out.println("all are equal");
    }
}