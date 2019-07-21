public class CarFactory {
    private static String color = "black";
    private static double weight = 1000;
    private static double price = 10000.40;

    private CarFactory() {
    }

    public static Car buildCarPrice(double price) {
        return new Car(weight, price, color);;
    }

    public static Car buildCarWeight(double weight, String color) {
        return new Car(weight, price, color);;
    }

}
