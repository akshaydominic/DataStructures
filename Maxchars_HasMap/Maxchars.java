
import java.util.*;
import java.util.Map.Entry;
public class Maxchars {
    public static void main(String[] args) {
        String input="Hello There!";
        LinkedHashMap<Character,Integer> chars = new LinkedHashMap<Character,Integer>();
        for(char c : input.toCharArray()){
            if(chars.containsKey(c)){
                chars.put(c, chars.get(c)+1);
            }else{
                chars.put(c, 1);
            }
        }
       for(Map.Entry entry : chars.entrySet()){
           System.out.println(entry.getKey()+" "+entry.getValue());
       }
       int max = 0;
       char max_c='\0';
       for(Map.Entry entry : chars.entrySet()){
        if((Integer)entry.getValue()>max){
            max = (int)entry.getValue();
            max_c=(char)entry.getKey();

        }
    }

       
       
       System.out.println("Max char "+max_c +" max value "+max);
       

    }
    
}
