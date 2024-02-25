import java.util.Scanner;
class Code_4{
    public static void main(String er[]){
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int sum=0;
        for(int i=1; i<=num; i++){
            sum+=i;
        }
        System.out.println("sum of natural number is "+sum);
    }
}