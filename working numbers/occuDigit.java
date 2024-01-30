import java.util.Scanner;

class occuDigit{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int n=sc.nextInt();
        int count=0;
        while(num>0){
            int rem=num%10;
            if(n==rem){
                count++;
            }
            num/=10;
        }
        System.out.print(n+"-->"+count);
    }
}