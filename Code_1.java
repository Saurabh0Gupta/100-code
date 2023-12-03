public class Code_1
{
    private int a;
    public Code_1(int a){
        this.a=a;
    }
    public void check(){
        if(a>=0){
            System.out.println("Given number is positive");
        }
        else{
            System.out.println("Given number is negative");
        }
    }
	public static void main(String[] args) {
	    Code_1 m=new Code_1(10);
	    m.check();
	}
}
