public class Main {
    public static void main(String[] args) {

Car car = CarFactory.buildCarPrice(10000);
car.setWeight(100);
        System.out.println(car.getWeight());
    }
}
