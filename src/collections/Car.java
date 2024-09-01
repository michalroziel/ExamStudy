package collections;

public class Car {

    private int iD;
    private String color;

    public Car(int givenID, String givenColor){
        this.iD = givenID;
        this.color = givenColor;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public int getiD() {
        return iD;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {

        return "iD:" + this.iD + "  color:" + this.color;
    }
}
