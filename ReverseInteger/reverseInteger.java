public class reverseInteger {
    //input = -12 -> -21

    public static void main(String[] args) {
        int input = 5678;
        int output = reverse(5678);
        System.out.println("Input : " + input + " Output : " + output);
        
    }
    public static int reverse_using_string(Integer n){
       boolean isNegative = n<0 ? true : false;
       if(isNegative){
           n =n*-1;
       }
       char[] number = String.valueOf(n).toCharArray();
       String reverse = "";
       for(char c : number){
            reverse = c + reverse;
       }
       return isNegative == true ? Integer.parseInt(reverse) * -1 : Integer.parseInt(reverse);
    }
    public static int reverse(int n){
        boolean isNegative = n<0 ? true : false;
       if(isNegative){
           n =n*-1;
       }
       int lastdigit =0;
       int reverse_number =0;
       while(n>=1){
           lastdigit = n %10;
           reverse_number= reverse_number * 10 +lastdigit;
           n=n/10;
       }
       return isNegative == true ? reverse_number *-1 : reverse_number;


    }
    
    
}
