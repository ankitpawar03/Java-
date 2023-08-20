public class FibonacciNumber {
    public static void main(String[] args) {

        // find n'th fibonacci number
        System.out.println(fibo(8));
    }
    static int fibo(int n){

        if(n<2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
