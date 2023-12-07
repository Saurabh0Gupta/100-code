class Code_8{
    public static void main(String er[]){
        int year=2020;
        if(year%400==0)
        System.out.println("this is leap year bro");
        else if(year%4==0 && year%100!=0)
        System.out.println("this is leap year bro");
        else
        System.out.println("this is not a leap year");
    }
}