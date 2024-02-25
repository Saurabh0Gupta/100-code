import java.util.Scanner;

class length{
    public static void main(String er[]){
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        int length=0;
        for(char a:str.toCharArray()){
            length++;
        }
        System.out.println(length);
    }
}