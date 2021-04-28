//capitalize(a short sentence) --> A Short Sentence
public class CapitalizeString {
    public static void main(String[] args) {
        String message = "look it worked!";
        System.out.println(cap(message));
        
    }
    public static String cap(String str) {
        String[] result = str.split("\\s");
        String output="";
        for(String re : result){
            String first = re.substring(0,1);
            String last = re.substring(1);
            output+=first.toUpperCase()+last+" ";
        }
        return output;
        
    }
}
