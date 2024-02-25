//perfect square number

class Code_24{
    public static void main(String er[]){
        int num=729;
        boolean result=perfectSquare(num);
        if(result){
            System.out.println("yes perfect square");
        }
        else{
            System.out.println("no it's not perfect square");
        }
    }
    static boolean perfectSquare(int n){
        int sqrt=(int)Math.sqrt(n);
        int ans=sqrt*sqrt;
        if(n==ans)
        return true;
        else
        return false;
    }
}