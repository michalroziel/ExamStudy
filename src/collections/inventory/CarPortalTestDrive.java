package collections.inventory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarPortalTestDrive {

    public static void main(String[] args) {

        Inventory carInv = new Inventory();

        Car c1 = new Car(1, "Volvo", "red", 50);
        Car c2 = new Car(2, "Ferrari", "blue",56);
        Car c3 = new Car(3, "Lamborghini", "yellow",90);
        Car c4 = new Car(4, "Lamborghini", "yellow",120);

        carInv.add(1, c1);
        carInv.add(2, c2);
        carInv.add(3, c3);
        carInv.add(4, c4);

        long res = carInv.countCars(p -> p.getColor().equals("yellow") &&
                        p.getMake().equals("Lamborghini"
                ));
        System.out.println(res);

        List<Car> ferrarisHP = new ArrayList<>(carInv.getCarsFilteredAndSorted(
                Comparator.comparing(Car::getHorsepower), p -> p.getMake().equals("Ferrari")));
    }
}