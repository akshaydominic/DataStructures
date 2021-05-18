import java.lang.reflect.Array;
import java.util.ArrayList;

class string{
//     Given a string S containing only digits (fixed size of 5 digits), Your task is to complete the
// function genIp() which returns an array containing all possible combinations of valid IPv4
// and takes only a string S as its only argument.
// Note: Order doesn&#39;t matter.
// For string 11211 the possible IPv4 are
// 1.1.2.11
// 1.1.21.1
// 1.12.1.1
// 11.2.1.1
    public static void main(String[] args) {
        ArrayList<String> f = genIp("11111");
        System.out.println(f.toString());
        
    }
    public static ArrayList<String> genIp(String s){
        
        ArrayList<String> solution= new ArrayList<>();
        String temp="";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i==j && j+1<s.length()){
                    temp=s.substring(j,j+2);

                }
                else{
                    temp+="."+s.substring(j,j+1);
                }
            }
            solution.add(temp+"\n");
            
        }
        return solution;

    }


}