package behavioral.templatemethod;


/**
 * Template method defines the steps to execute an algorithm and it can provide default
 * implementation that might be common for all or some of the subclasses.
 */
public class HousingClient {

    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }

}
