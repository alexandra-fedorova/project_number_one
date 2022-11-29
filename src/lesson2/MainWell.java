package lesson2;

public class MainWell {

    public static void main(String[] args) {

        Well well1 = new Well("concrete", 3.75, 1200, true, HatchType.HEAVY);

//        System.out.println(well.getMaterial());
//        System.out.println(well.getHeight());
//        System.out.println(well.getDiameter());
//        System.out.println(well.getWaterproofed());
//        System.out.println(well.getHatchType());

        System.out.println(well1);

        Well well2 = new Well();

        System.out.println(well2);

    }

}
