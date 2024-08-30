public class IterativeSum {

  private  int input ;

   public  int computeSum(int sumToCompute) {

       if (sumToCompute >= 0) {
           for (int i = 0; i <= sumToCompute;i++){
               this.input = input + i ;

           }

           return this.input;
       }
       else return -1;
   }
}
