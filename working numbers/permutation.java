import java.util.Scanner;

class permutation{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int diff=n-r;                  
        int nFact=fact(n); 
        int minRFact=fact(diff); 
        int ans=nFact/minRFact;
        System.out.print(ans);                  
        
    }
    static int fact(int n){
        if(n<=1) return 1;
        return n*fact(n-1);
    }
}