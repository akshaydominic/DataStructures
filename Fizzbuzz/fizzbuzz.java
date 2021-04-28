public class fizzbuzz {
    // multiple of 3 fizz multiple of 5 buzz and both fizzbuzz
    public static void main(String[] args) {
        print_fizzbuzz(50);
    }

    public static void print_fizzbuzz(int n) {
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            }else if(i%3==0){
                System.out.println("fizz");
            }
            else if(i%5==0){
                System.out.println("buzz");
            }else{
            System.out.println(i);
            }
        }

    }
}
