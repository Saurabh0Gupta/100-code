// power of number using recursion

class PowerOfNum{
    public static void main(String er[]){
        int num=5;
        int pow=5;
        int result=power(num,pow);
        System.out.print("power of number "+result);
    }
    static int power(int num,int pow){
        if(pow==0) return 1;
        return num*power(num,pow-1);
    }
}