import java.util.Scanner;
class Code_12{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        System.out.println("reverse of given number is "+sum);
    }
}