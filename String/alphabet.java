import java.util.Scanner;
class alphabet{
    public static void main(String er[]){
        Scanner sc= new Scanner(System.in);
        char c=sc.next().charAt(0);
        int ch=c;
        if(ch>=65 && ch<=90 || ch>=97 && ch<=122){
            System.out.println("yea alphabet hai");
        }
        else{
            System.out.println("not alphabet");
        }
    }
}