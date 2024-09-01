package ex3;

import innerClasses.Operation;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class NumberCruncher {

    Random rand = new Random();
    float[] numbers;

    public NumberCruncher(float[] givenNumbers, int arraySize){

        numbers = new float[arraySize];
        numbers = givenNumbers;
        // initialisierung
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextFloat();
        }

    }

    public void crunch(String[] operations ){

        Iterator<String> iter = Arrays.stream(operations).iterator();

        while (iter.hasNext()){
            String currOP = iter.next();

            switch (currOP){
                case "sum" :
                    new Operation(){
                        @Override
                        public void apply() {

                            for ( int i = 1; i < numbers.length;i++){
                                numbers[i] = numbers[i-1] + numbers[i] ;
                            }

                        }
                    }.apply();
                 break;

                case "swirl" :


                break;

                case "divide" :

                    new Operation(){

                        @Override
                        public void apply() {

                            Arrays.sort(numbers);
                            int half = numbers.length / 2;

                            for (int i = 0;  i <  half; i++){
                                numbers[i] = numbers[numbers.length-1-i] / numbers[i];
                            }
                        }
                    }.apply();



                  break;

                case "subtract" :

                    new Operation(){
                        @Override
                        public void apply(){

                            for (int i = 1 ; i < numbers.length;i++){
                                numbers[i] = numbers[i] - numbers[i-1] ;
                            }
                        }
                    }.apply();

                case "average"  :


                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + currOP);
            }



        }

    }


}
