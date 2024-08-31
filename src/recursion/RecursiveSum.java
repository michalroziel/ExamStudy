package recursion;

public class RecursiveSum {

    private int input;

    public int computeRecSum(int sumToCompute ){

        // sanitize input
        if ( sumToCompute < 0 ){
            return -1 ;
        }
        if (sumToCompute == 0 ){
            return  0 ;
        }
        // Gauss Summenformel
        else {

            return sumToCompute + computeRecSum(sumToCompute-1);

        }

    }
}
