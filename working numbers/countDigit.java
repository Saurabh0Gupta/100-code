import java.util.Scanner;

class countDigit{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num>0){
            int rem=num%10;
            count++;
            num=num/10;
        }
        System.out.print(count);
    }
}