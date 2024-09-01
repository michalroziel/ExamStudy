package generics;

public class Box<T>{


    /**
     *
     * Here, Box can store any type T.
     */
    private T item ;

    public void setItem(T item ){
        this.item = item;
    }

    public <T> void printItem(T item) {
        System.out.println(item);
    }

    public < T extends Number > void addnumbers ( T num1, T num2){

        System.out.println(num1.doubleValue()+num2.doubleValue());
    }

}
