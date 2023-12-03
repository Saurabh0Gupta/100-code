import java.util.Scanner;
class Code_6{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2)
        System.out.println("num1 is greater number");
        else if(num2>num1)
        System.out.println("num2 is greater number");
        else
        System.out.println("num1==num2");
    }
}