import java.util.Scanner;
class Code_10{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        boolean count=true;
        for(int i=num1; i<=num2; i++){
            if(i==1){
                System.out.println(i);
            }
            for(int j=2; j<i; j++){
                if(i%j==0){
                    count=false;
                }
            }
            if(count==true){
                System.out.println(i);
            }
        }
    }
}