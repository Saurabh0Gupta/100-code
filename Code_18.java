import java.util.Scanner;
class Code_18{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
        if(num>1){
            fact(num);
        }else{
            System.out.println("factorial is "+fact);
        }
    }
    static void fact(int n){
        int result=0;
        for(int i=1; i<n; i++){
            result=n*i;
        }
        System.out.print("factorial is "+result);

    }
}