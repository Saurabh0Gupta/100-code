class Code_3{
    private int num;
    public Code_3(int num){
        this.num=num;
    }
    public int sum_of(){
        int sum=0;
        for(int i=1; i<=num; i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String er[]){
        Code_3 m=new Code_3(5);
        System.out.println(m.sum_of());
    }
}