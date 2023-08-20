public class NumberExample {
    public static void main(String[] args){

        //write a function that takes in a number and print it

        print1(5);

        // while the function is not finished executing it remains in stack memory
        // when a funtion finishes executing it is removed from the stack and the flow of program is restored to
        // where that function is called
    }
    static void print1(int n){
        System.out.println(n);
        print2(4);
    }

    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(2);
    }
    static void print4(int n){
        System.out.println(n);
        print5(1);
    }
    static void print5(int n){
        System.out.println(n);
    }
}
