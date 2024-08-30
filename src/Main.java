public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        IterativeSum iterSumTestDrive = new IterativeSum();
        System.out.println(iterSumTestDrive.computeSum(100));

        RecursiveSum recSumTestDrive = new RecursiveSum();
        System.out.println(recSumTestDrive.computeRecSum(100));

        RecursiveFib recFibTestDrive = new RecursiveFib();
        System.out.println(recFibTestDrive.computeRecFib(20));
        IterativeFib iterativeFibTestDrive = new IterativeFib();
        System.out.println(iterativeFibTestDrive.computeIterFib(20));
    }
}