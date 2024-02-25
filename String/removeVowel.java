import java.util.Scanner;
class removeVowel{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str="";

        for(char c:s.toCharArray()){
            if(!isVowel(c)){
                str=str+c;
            }
        }
        System.out.print(str);
    }
    static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'||c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )
        return true;
        else return false;
    }
}