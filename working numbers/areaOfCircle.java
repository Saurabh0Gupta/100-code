import java.util.Scanner;

class areaOfCircle{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        double ans=Math.PI*(num*num);
        System.out.print("area of circle "+ans);
    }
}