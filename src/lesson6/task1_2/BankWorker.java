package lesson6.task1_2;

public class BankWorker extends Human{

    public BankWorker(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    private String bankName;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
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
        System.out.println("Имя сотрудника: " + name);
        System.out.println("Фамилия сотрудника: " + surname);
        System.out.println("Наименование банка: " + bankName);
    }


    @Override
    public void rateTheWork() {
        System.out.println("Метод выводит оценку, полученную работником");
    }
}
