public class pyramid{
    public static void main(String[] args) {
        pyramid_steps(3);
        
    }
    public static void pyramid_steps(int n){
       int midpoint= (int)Math.floor((n*2-1)/2);
       for(int i=0;i<n;i++){
           String result="";
           for(int column=0;column<(n*2-1);column++){
               if(midpoint-i<=column && midpoint+i>=column){
                    result+="#";
               }
               else{
                   result+=" ";
               }
              
           }
           System.out.println(result);
           
       }
    }
}