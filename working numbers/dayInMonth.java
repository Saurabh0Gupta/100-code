import java.util.Scanner;

class dayInMonth{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        switch(month){
            case 1:case 3: case 5:case 7 :case 8:case 10: case 12:
                System.out.println("31 days in months");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days in a months");
                break;
            default:
                System.out.print("28 days in non leap year");
        }
        
    }
}