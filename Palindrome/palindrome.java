public class palindrome {

    public static void main(String[] args) {
        System.out.println(check_palindrome("abba"));
        
    }
    public static boolean check_palindrome(String message){
        char[] message_char = message.toCharArray();
        String reverse="";
        for(char c : message_char){
            reverse=c+reverse;
        }
        if(reverse.equals(message)){
            return true;
        }
        else{
            return false;
        }
    }
    
}
