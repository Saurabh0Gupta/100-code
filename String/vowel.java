import java.util.Scanner;
class vowel{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(isVowel(c)){
            System.out.println("yes vowel");
        }else{
            System.out.println("Consonent");
        }
    }
    static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'||c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )
        return true;
        else return false;
    }
}