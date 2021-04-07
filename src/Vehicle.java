public abstract class Vehicle {
    String brand;
    int kilometers;

    public Vehicle(String brand, int kilometers)
    {
        this.brand=brand;
        this.kilometers=kilometers;
    }

    public abstract String doStuff();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
}
