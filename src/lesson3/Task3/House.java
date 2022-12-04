package lesson3.Task3;

public class House {

    private Integer floorNumber;
    private Integer constructionYear;
    private String name;

    public House(Integer floorNumber, Integer constructionYear, String name) {
        this.floorNumber = floorNumber;
        this.constructionYear = constructionYear;
        this.name = name;
    }

    public House(Integer constructionYear) {
        this.constructionYear = constructionYear;
    }


    public Integer getFloorNumber() {

        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {

        this.floorNumber = floorNumber;
    }

    public Integer getConstructionYear() {

        return constructionYear;
    }

    public void setConstructionYear(Integer constructionYear) {

        this.constructionYear = constructionYear;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String toString() {
        return "House{" +
                "floorNumber=" + floorNumber +
                ", consructionYear=" + constructionYear +
                ", name=" + name +
                "}";
    }
}
