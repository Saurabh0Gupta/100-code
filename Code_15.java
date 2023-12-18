import java.util.Scanner;
class Code_15{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        // int num=sc.nextInt();
        for(int i=start; i<=end; i++){
            int sum=0;
            int copy=i;
            while(copy!=0){
                int rem=copy%10;
                sum=sum+(int)Math.pow(rem,3);
                copy=copy/10;    
            }
            if(i==sum){
                System.out.print(i+" ");
            }
        }

    }
}