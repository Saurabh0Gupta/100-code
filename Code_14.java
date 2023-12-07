import java.util.Scanner;
class Code_14{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int copy=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+((int)Math.pow(rem,3));
            num=num/10;
        }
        if(copy==sum)
        System.out.println("yes number is amrstrong number");
        else
        System.out.println("no number is not amrstrong number");
    }
}