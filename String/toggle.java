import java.util.Scanner;

class toggle{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s="";
        for(char c:str.toCharArray()){
            if(Character.isUpperCase(c)){
            s=s+Character.toLowerCase(c);
            }else{
              s=s+Character.toUpperCase(c);  
            }
        }
        System.out.print(s);
    }
}