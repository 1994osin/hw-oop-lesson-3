package transport;

public class Car extends Transport {
    private String gear;
    private String body;
    private String number;
    private int capacity;
    private boolean summerTypes;
    private Key key;
    private Insurance insurance;

    private static class Key {

    }

    private static class Insurance {

    }

    public Car(String brand,
               String model,
               int productionYear,
               String country,
               String color,
               int maxSpeed,
               String fuel,
               double percentageFuel,
               String gear,
               String body,
               String number,
               int capacity,
               boolean summerTypes,
               Key key,
               Insurance insurance) {
        super(brand, model, productionYear, country, color, maxSpeed, fuel, percentageFuel);
        this.gear = gear;
        this.body = body;
        this.number = number;
        this.capacity = capacity;
        this.summerTypes = summerTypes;
        this.key = key;
        this.insurance = insurance;
    }

    @Override
    public void refill() {
        System.out.println("Автомобиль заправлен топливом " + getFuel());
        setPercentageFuel(100);
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isSummerTypes() {
        return summerTypes;
    }

    public void setSummerTypes(boolean summerTypes) {
        this.summerTypes = summerTypes;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return super.toString() + " Car{" +
                "gear='" + gear + '\'' +
                ", body='" + body + '\'' +
                ", number='" + number + '\'' +
                ", capacity=" + capacity +
                ", summerTypes=" + summerTypes +
                ", key=" + key +
                ", insurance=" + insurance +
                "} ";
    }
}
