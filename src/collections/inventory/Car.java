package collections.inventory;

public class Car {
    public int getiD() {
        return iD;
    }

    public String getMake() {
        return make;
    }

    private int iD;
    private String make;
    private String color;

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    private int horsepower;


    public String getColor() {
        return this.color;
    }


    public Car(int giveniD , String givenMake, String color, int givenHP){
        this.iD = giveniD;
        this.make = givenMake;
        this.color = color;
        this.horsepower = givenHP;
    }


    
}
