//automorphic number is those number whose square last digit is equal to given input last digit

class Code_25{
    public static void main(String er[]){
        int num=9;
        int sq=num*num;
        if(num%10==sq%10)
        System.out.print("yes automorhic number");
        else
        System.out.print("no it's not");
    }
}