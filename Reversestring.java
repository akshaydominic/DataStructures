//for a given string reverse the string input apple
public class Reversestring{
    public static void main(String[] args){
        String str="apple";
        
        String[] temp = str.split("");
        String reverse="";
        for(String c :temp){
            reverse = c+reverse;
        }
        System.out.println("Result :"+reverse);
    }
}