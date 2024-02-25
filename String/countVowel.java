import java.util.Scanner;

class countVowel{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int vol=0;
        for(char c:s.toCharArray()){
            if(isVowel(c)){
                vol++;
            }
        }
        System.out.println(vol);
    }
    static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'||c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )
        return true;
        else return false;
    }
}