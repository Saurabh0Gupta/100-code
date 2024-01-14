class deciToBani{
    public static void main(String er[]){
        int num=10;
        int bit=0;
        int i=0;
        int ans=0;
        while(num>0){
            bit=num&1;
            ans=bit*(int)Math.pow(10,i)+ans;
            num=num>>1;
            i++;
        }
        System.out.println("ans "+ans);
    }
}