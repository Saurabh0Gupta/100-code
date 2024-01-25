//replace all the zeros with ones

import java.util.Scanner;

class replace0{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String str=Integer.toString(num);
        int len=str.length();
        String str2="";
        for(int i=0; i<len; i++){
            if(str.charAt(i)=='0')
            str2=str2+'1';
            else
            str2=str2+str.charAt(i);
        }
        System.out.print("converted number is "+str2);
      
    }
}
//done program