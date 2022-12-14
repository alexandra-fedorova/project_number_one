package lesson6.task1_2;

public class Client extends Human{

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    private String bankName;

    private String getBankName() {
        return bankName;
    }

    private void setBankName() {
        this.bankName = bankName;
    }

    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                "surname='" + surname + '\'' +
                "bankName='" + bankName + '\'' +
                '}';
    }

    public void info() {
        System.out.println("Имя клиента: " + name);
        System.out.println("Фамилия клиента: " + surname);
        System.out.println("Наименование банка: " + bankName);
    }


    @Override
    public void rateTheWork() {
        System.out.println("Метод выводит какую оценку поставил клиент сотруднику");
    }
}
