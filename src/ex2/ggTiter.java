package ex2;

public class ggTiter {


    public int findGGTiter(int a , int b ){

      while (b!= 0){

          int temp = b;
           b  = a%b;
           a = temp;

      }
      return a;

    }


}
