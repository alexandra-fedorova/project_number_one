package lesson6.task3;

public class Truck extends Car{

    @Override
    public void outPut() {
        super.outPut();
    }

    public Truck(int w, String m, char c, float s) {
        super(w, m, c, s);
    }

    public Truck(int w, String m, char c, float s, String numberOfWheels, Integer maxWeight) {
        super(w, m, c, s);
        this.numberOfWheels = numberOfWheels;
        this.maxWeight = maxWeight;
    }

    public Truck() {
        super();
    }

    public String numberOfWheels;
    public Integer maxWeight;

    public String getNumberOfWheels() {
        return numberOfWheels;
    }

    public Integer getMaxWeight() {
        return maxWeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "numberOfWheels='" + numberOfWheels + '\'' +
                ", maxWeight=" + maxWeight +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", speed=" + speed +
                '}';
    }

    public int newNumberOfWheels() {
        int newNumberOfWheels;
        newNumberOfWheels = 3;
        return newNumberOfWheels;
    }

    public void printInfo() {
        System.out.println("New number of wheels are " + newNumberOfWheels());
    }
}
