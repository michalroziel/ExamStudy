package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class CarArrayListTestDrive {
    public static void main(String[] args) {

    ArrayList<Car> cars = new ArrayList<Car>();

    cars.add(new Car(1,"white"));
    cars.add(new Car(2,"blue"));
    cars.add(new Car(3,"black"));
    cars.add(new Car(4,"red"));
    cars.add(new Car(5,"yellow"));


    System.out.println((cars));

    for (int i = 0 ; i < 2 ; i++){
        cars.get(i).setColor("black") ;
    }
    System.out.println(cars);

        Iterator<Car> iter = cars.iterator();

        //Consumer<Car> c = d -> d.setColor("ORANGE");
        iter.forEachRemaining(c -> c.setColor("black"));

        cars.stream().forEach(

                new Consumer<Car>() {
                    @Override
                    public void accept(Car car) {

                        if (cars.indexOf(car) % 2 == 0){
                        car.setColor("MAGENTA");
                        }
                        else {
                            car.setColor("GREEN");
                        }


                    }

                }
        );

        cars.forEach(System.out::println);

        cars.removeIf(c -> c.getColor().equals("MAGENTA") );

        cars.forEach(new Consumer<Car>() {
            @Override
            public void accept(Car car) {
                if (car.getColor().equals("MAGENTA")) {
                    cars.remove(cars.indexOf(car));
                }
            }
        });

        cars.forEach(System.out::println);

    }
}
