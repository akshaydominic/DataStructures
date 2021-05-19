import java.util.function.Consumer;
import java.util.function.Predicate;

class lambdaTest{
    public static void main(String[] args) {
        int[] numbers = {1,6,2,3,4,10,12,15};
        findgreaterthan5(numbers,wrapperLambda(i->System.out.println(i/2)));    
    }

    private static void findgreaterthan5(int[] numbers,Consumer<Integer> p) {
        for(int i:numbers){
            p.accept(i);
        }
    }
    private static Consumer<Integer> wrapperLambda (Consumer<Integer> p){
        return i->{
            try {
                p.accept(i);
                
            } catch (ArithmeticException e) {
                System.out.println("Error found in Wrapper Class");
            }

        };
    }

}