package ex2;

public class ggTRec {


    public int findGGt(int a, int b ){

        if (b == 0){
            return a;
        }
        else{
            return findGGt(b,a%b);
        }

    }


}
