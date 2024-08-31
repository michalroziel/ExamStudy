package recursion;

public class RecursiveFib {

    public int computeRecFib(int sequenceToCompute){

        if (sequenceToCompute <= 2 ) {
            return  1;
        }
        else {
            return computeRecFib(sequenceToCompute - 1) +
                    computeRecFib(sequenceToCompute - 2);
        }
    }

}
