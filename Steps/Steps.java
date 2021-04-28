public class Steps {
    public static void main(String[] args) {
        Print_stairs(4);
        fib_print_stairs(4, 0, "");
        
    }
    private static void Print_stairs(int n) {
        int i=0,j=0;
        for(i=1;i<=n;i++){
            for(j=0;j<=n;j++){
                if(j<i){
                    System.out.print("#");
                }
                else{
                    System.out.print("s");
                }
            }
            System.out.println();
        }
        
    }

    private static void fib_print_stairs(int n,int rows,String str){
        if(n==rows){
            return;
        }
        if(str.length()==n){
            System.out.println(str);
            fib_print_stairs(n, rows+1, "");
            return;
        }
        if(str.length()<=rows){
            str+="#";
        }else{
            str+=" ";
        }
        fib_print_stairs(n, rows, str);
    }
    
}
