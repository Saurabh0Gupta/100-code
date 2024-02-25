import java.util.Scanner;

class palindrome{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char c[]=str.toCharArray();
        boolean palin=true;
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(c[left]==c[right]){
                left++;
                right--;
                palin=true;
            }
            else{
                palin=false;
                return;
            }
        }
        if(palin){
            System.out.print("yes palindrome");
        }else{
            System.out.print("not palindrome");
        }
    }
}