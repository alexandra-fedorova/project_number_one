package lesson6.task1_2;

public class Main {

    public static void main(String[] args) {

        Client client = new Client("Александра", "Федорова", "Альфа Банк");
        BankWorker bankWorker = new BankWorker("Федор", "Александров", "Альфа банк");

        client.info();
        bankWorker.info();

        client.rateTheWork();
        bankWorker.rateTheWork();

    }



}
