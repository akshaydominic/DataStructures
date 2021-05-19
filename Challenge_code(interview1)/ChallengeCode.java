public class ChallengeCode{
    public static void main(String[] args) {

        //Given a non-negative integer number, repeatedly add all its digits until the result has only one digit.
        // For example, if we consider 98, we get 9+8 = 17 after first addition. Then
        // we get 1+7 = 8.  We stop at this point because we are left with one digit.
        solution(98);


    }
    private static int resultonedigit(int number) {
        int sum=0,lastdigit=0;
        while(number!=0){
            //find the last number
            lastdigit = number %10;
            //sum that number
            sum+=lastdigit;
            //delete the number 
            number= number/10;
        }
        return sum;
        
    }
    private static void solution(int number){
        int s=number;
        while(s/10!=0){
            s=resultonedigit(s);
            System.out.println(s);
        }

        System.out.println("the solution is :"+s);
    }
}