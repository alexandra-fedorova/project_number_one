package lesson2;

public class Well {

    private String systemType;
    private String material;
    private Double height;
    private Integer diameter;
    private Boolean isWaterproofed;
    private HatchType hatchType;


    public Well(String material, Double height, Integer diameter, Boolean isWaterproofed, HatchType hatchType) {
        this.systemType = systemType;
        this.material = material;
        this.height = height;
        this.diameter = diameter;
        this.isWaterproofed = isWaterproofed;
        this.hatchType = hatchType;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    public Boolean getWaterproofed() {
        return isWaterproofed;
    }

    public void setWaterproofed(Boolean waterproofed) {
        isWaterproofed = waterproofed;
    }

    public HatchType getHatchType() {
        return hatchType;
    }

    public void setHatchType(HatchType hatchType) {
        this.hatchType = hatchType;
    }
}
