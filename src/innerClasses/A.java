package innerClasses;

public class A {

    private int i;
    private int j;

    A(){
        i = 42;
        j = 420;
    }
    public class B{

        public void print(){
            System.out.println("i:" + i);
            System.out.println("j:" + j);

        }
    }
}
