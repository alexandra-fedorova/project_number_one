package lesson6.task4;

public class Minor extends Major{

    @Override
    public Integer getNumber() {
        return super.getNumber();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void print() {
        number = 2;
        System.out.println(number);
    }
}
