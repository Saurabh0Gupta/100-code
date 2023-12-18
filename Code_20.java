import java.util.Scanner;
class Code_20{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1; i<num; i++){
            if(num%i==0){
                System.out.print(i+",");
            }
        }
    }
}