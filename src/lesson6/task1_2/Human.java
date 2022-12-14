package lesson6.task1_2;

public abstract class Human implements Rate {
    public String name;
    public String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                "surname='" + surname + '\'' +
                '}';
    }

    public abstract void info();
}
