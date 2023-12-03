import java.util.Scanner;
class Code_5{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=0;
        for(int i=num1; i<=num2; i++){
            sum+=i;
        }
        System.out.println("sum of number between given by you "+sum);
    }
}