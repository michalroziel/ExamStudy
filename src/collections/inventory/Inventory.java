package collections.inventory;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Inventory {

    LinkedHashMap<Integer, Car> cars ;

    public Inventory(){
        cars = new LinkedHashMap<>();
    }

    public void add(Integer id, Car car){
        cars.put(id,car);
    }

    public void remove(Integer id ){
        cars.remove(id);
    }

    public List<Car> getCarsSorted (Comparator<Car> comp){

        List<Car> listOfCars = new ArrayList<>(cars.values());

        for (int i = 0 ; i <= listOfCars.size();i++){

            for (int j =  listOfCars.size()-1 ; j >= 1;j++){

                if ( comp.compare(listOfCars.get(j-1),listOfCars.get(j)) > 0){
                    Car temp =  listOfCars.get(j-1);
                    listOfCars.set(j-1,listOfCars.get(j)) ;
                    listOfCars.set(j,temp);
                }

            }


        }

/*
 *     procedure bubbleSort(A : list of sortable items )
 *         n = length(A)
 *         for i = 1 to n-1 inclusive do
 *             for j = n-1 downto 1 inclusive do
 *             if A[j-1] > A[j] then
 *         swap( A[j-1], A[j] )
 *         end if
 *         end for
 *         end for
 *         end procedure
 *
 */
        return listOfCars;

    }

    public List<Car> getCarsFiltered(Comparator<Car> comp, Predicate<Car> pred){


        return cars.values().parallelStream().filter(pred).sorted(comp).toList();
    }
    public List<Car> getCarsFilteredAndSorted(Comparator<Car> c,Predicate<Car> p){

        return cars.values().parallelStream().filter(p).sorted(c).toList();

    }

    public Map<String,List<Car>> getCarsFilteredAndGrouped(Predicate<Car> pred){
     return cars.values().parallelStream().filter(pred).collect(Collectors.groupingBy(Car::getMake));
    }

    public long countCars(Predicate<Car> p ){

        return cars.values().parallelStream().filter(p).count();

    }




}
