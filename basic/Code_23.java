//perfect number are those number whose sum is equal to given input


class Code_23{
    public static void main(String er[]){
        int num=28;
        isPerfect(num);
    }
    static void isPerfect(int n){
        int ans=0;
        int copy=n;
        for(int i=1; i<n; i++){
            if(n%i==0){
                ans=ans+i;
            }
        }
        if(copy==ans){
            System.out.print("Perfect number hai "+ans);
        }else{
            System.out.print("nhi hai perfect "+ans);
        }
        
    }
}




// ye kuch aur ho gya kyuki isme maine uske factor ka sum nikal diya
// class Code_23{
//     public static void main(String er[]){
//         int num=28;
//         isPerfect(num);
//     }
//     static void isPerfect(int n){
//         int ans=1;
//         int copy=n;
//         for(int i=2; i<=n; i++){
//             while(n%i==0){
//                 System.out.print(i);
//                 ans=ans+i;
//                 n=n/i;
//             }
//         }
//         if(copy==ans){
//             System.out.print("Perfect num hai "+ans);
//         }else{
//             System.out.print("Perfect number nhi hai "+ans);
//         }
//     }
// }