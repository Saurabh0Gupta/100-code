//prime number using recursion

class PrimeNum{
    public static void main(String er[]){
        int num=8;
        if(isPrime(num,2))
        System.out.print("prime number hai");
        else
        System.out.print("not its not prime");
    }
    static boolean isPrime(int num,int i){
        if(i>=num) return true;
        if(num%i==0)
        return false;
        return isPrime(num,i+1);
    }
}