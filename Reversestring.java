//for a given string reverse the string input apple
public class Reversestring{
    public static void main(String[] args){
        String str="apple";
        String reverse ="";
        char[] temp = str.toCharArray();
        for(char c:temp){
            reverse = c+reverse;
        }
        System.out.println("Result "+reverse);
    }
}