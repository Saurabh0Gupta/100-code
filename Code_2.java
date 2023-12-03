class Code_2{
    private int num;
    public Code_2(int a){
        num=a;
    }
    public void check(){
        if(num%2==0)
        System.out.println("number is even");
        else
        System.out.println("number is odd");
    }
    public static void main(String srg[]){
        Code_2 m=new Code_2(23);
        m.check();
    }
}