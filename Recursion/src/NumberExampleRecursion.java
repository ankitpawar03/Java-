public class NumberExampleRecursion {
    public static void main(String[] args) {

        print(5);
    }

    static void print(int n){

        // base condition where recursion will stop making new calls
        // every function call take separate memory
        // if there is no base condition stack will be filled again and again
        // memory if computer will exceed the limit and it will give stack overflow error

        // why do we need recursion ?.
        // when a function calling itself is known as recursion
        // it helps us in solving bigger complex problems in simpler way

        // you can convert the recursion solution in iteration and vice-versa
        // space complexity is not constant because of recursive calls
        // it helps us in bigger problems in smaller problems

        if(n == 0){
            return;
        }

        System.out.println(n);
        print( --n );
    }
}
