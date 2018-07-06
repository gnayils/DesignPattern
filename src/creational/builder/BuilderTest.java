package creational.builder;


/**
 * There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.
 * 1.Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time,
 * the type of arguments are same and from client side its hard to maintain the order of the argument.
 * 2.Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional
 * parameters need to send as NULL.
 * 3.If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.
 */
public class BuilderTest {

    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comp = new Computer
                .ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
    }
}
