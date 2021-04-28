import java.util.*;

public class anagram {
    public static void main(String[] args) {
        String test1 = "Debit card";
        String test2= "Bad credit.";
        System.out.println(anagram1(test1, test2));


    }

    public static boolean anagram1(String msg1, String msg2) {
       
        String m1 = msg1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String m2 = msg2.replaceAll("[^a-zA-Z]", "").toLowerCase();
        if (m1.length() != m2.length()) {
            return false;
        }

        LinkedHashMap<Character, Integer> test_anagram1 = new LinkedHashMap<Character, Integer>();
        LinkedHashMap<Character, Integer> test_anagram2 = new LinkedHashMap<Character, Integer>();

        adding_hashmap(test_anagram1, m1);
        adding_hashmap(test_anagram2, m2);
        //simple method using the equals
        // if(test_anagram1.equals(test_anagram2)){
        //     return true;
        // }else{
        //     return false;
        // }
        for(Map.Entry entry : test_anagram1.entrySet()){
            if(entry.getValue()!=test_anagram2.get(entry.getKey())){
                return false;
            }
        }
        return true;

    }
    public static void adding_hashmap(Map<Character,Integer> test_anagram1,String m1){
        for (char c : m1.toCharArray()) {
            if (test_anagram1.containsKey(c)) {
                test_anagram1.put(c, test_anagram1.get(c) + 1);
            } else {
                test_anagram1.put(c, 1);
            }
        }
    }

}
