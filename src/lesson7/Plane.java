package lesson7;

public class Plane {

    static class Wing {
        public Integer wingWeight;

        public Wing(Integer wingWeight) {
            this.wingWeight = wingWeight;
        }

        public Integer getWingWeight() {
            return wingWeight;
        }

        public void setWingWeight(Integer wingWeight) {
            this.wingWeight = wingWeight;
        }

        @Override
        public String toString() {
            return "Wing{" +
                    "wingWeight=" + wingWeight +
                    '}';
        }

        public void print() {
            System.out.println("Вес крыла от самолета составляет " + wingWeight);
        }
    }

}
