//strong number is the whose sum of fact of didgit is equal to given input

class Code_22{
    public static void main(String er[]){
        int num=145;
        isStrong(num);

    }
    static void isStrong(int n){
        int ans=0;
        int copy=n;
        while(n>0){
            int rem=n%10;
            ans=fact(rem)+ans;
            n=n/10;
        }
        if(copy==ans){
            System.out.print("strong hai "+ans);
        }
        else{
            System.out.print("nhi hai strong "+ans);
        }
    }
    static int fact(int n){
        int facto=1;
        if(n==1){
            return facto;
        }
        else{
            for(int i=1; i<=n; i++ ){
                facto=facto*i;
            }
             return facto;
        }
   
}
}








//amStrong number program cubical sum of digit should be equal to given input

// class Code_22{
//     public static void main(String er[]){
//         int num=153;
//         isamstrong(num);
//     }
//     static void isAmstrong(int n){
//         int ans=0;
//         int copy=n;
//         while(n>0){
//             int digit=n%10;
//             ans=(int)Math.pow(digit,3)+ans;
//             n=n/10;
//         }
//         if(copy==ans){
//             System.out.print("Strong number hai "+ans);
//         }
//         else{
//             System.out.print("Strong number nhi hai "+ans);
//         }
//     }

// }