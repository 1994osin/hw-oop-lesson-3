package transport;

public class Bus extends Transport {
    public Bus(String brand,
               String model,
               int productionYear,
               String country, String color,
               int maxSpeed,
               String fuel,
               double percentageFuel) {
        super(brand, model, productionYear, country, color, maxSpeed, fuel, percentageFuel);
    }

    @Override
    public void refill() {
        System.out.println("Автобус заправлен топливом " + getFuel());
        setPercentageFuel(100);
    }
}
