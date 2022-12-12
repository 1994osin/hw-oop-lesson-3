package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String country;
    private String color;
    private int maxSpeed;
    private String fuel;
    private double percentageFuel;

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String country,
                     String color,
                     int maxSpeed,
                     String fuel,
                     double percentageFuel) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.country = country;
        this.fuel = fuel;
        setPercentageFuel(percentageFuel);
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public abstract void refill();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = (color == null || color.isEmpty() || color.isBlank()) ? "белый" : color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = (maxSpeed <= 0) ? 100 : maxSpeed;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getPercentageFuel() {
        return percentageFuel;
    }

    public void setPercentageFuel(double percentageFuel) {
        if (percentageFuel < 0) {
            this.percentageFuel = 0;
        } else if (percentageFuel > 100) {
            this.percentageFuel = 100;
        } else {
            this.percentageFuel = percentageFuel;
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuel='" + fuel + '\'' +
                ", percentageFuel=" + percentageFuel +
                '}';
    }
}
