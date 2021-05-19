import java.util.function.Predicate;

class lambdaTest{
    public static void main(String[] args) {
        int[] numbers = {1,6,2,3,4,10,12,15};
        findgreaterthan5(numbers,i->i>5);    
    }

    private static void findgreaterthan5(int[] numbers,Predicate<Integer> p) {
        for(int i:numbers){
            if(p.test(i)){
                System.out.println(i);
            }
        }
    }

}