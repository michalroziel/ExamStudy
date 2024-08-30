public class IterativeFib {

    public int computeIterFib(int n) {

        int result = 0;

        int fib0 = 0 ;
        int fib1 = 1 ;

        for (int i = 0; i <= n; i++) {

            if (i == 0 ) {
                result = fib0;
            } else if (i == 1) {
                result = fib1;
            } else {

                result = fib0 + fib1;
                fib0 = fib1;
                fib1 = result;
            }
        }
        return result;
    }

}