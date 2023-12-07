import java.util.Scanner;
class Code_13{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int copy=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        if(copy==sum)
        System.out.println("number is pallindrome");
        else
        System.out.println("number is not pallindrome");
    }
}