import java.util.Scanner;
class Code_9{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<2){
            System.out.println("number is not prime number");
            System.exit(0);
        }
        int count=0;
        for(int i=2; i<=num; i++){
            if(num%i==0){
                count+=1;
            }
        }
        if(count>1){
            System.out.println("number is not  prime number");
        }
        else{
            System.out.println("number is prime number");
        }
    }
}