public class stringSplit{
   public static void main(String[] args) {
    String is="11111";
    String ip=
        is.charAt(0)
        +"."+
        is.charAt(1)
        +"."+
        is.charAt(2)
        +"."+
        is.charAt(3)
        +"."+
        is.charAt(4);
    
    int placement =1;
    while(placement < 8){
        StringBuilder  ab = new StringBuilder(ip);
        ab.deleteCharAt(placement);
        placement+=2;
        System.out.println(ab.toString());
    }
        
        
    
   }
}