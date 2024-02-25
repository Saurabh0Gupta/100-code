import java.util.Scanner;
class Code_16{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0,b=1;
        int nextnum=0;
        System.out.print(a+","+b+",");

        for(int i=2; i<num; i++){
            nextnum=a+b;
            a=b;
            b=nextnum;
            System.out.print(nextnum+",");
        }
    }
}