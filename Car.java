public class Car {
    String model;
    String color;
    int doorCount;
    String logo;
    boolean isElectric;
    double engineVolume;

    public void gas() {
        System.out.println("I am driving");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", logo='" + logo + '\'' +
                ", isElectric=" + isElectric +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public Car(String model, String color, int doorCount, boolean isElectric, double engineVolume) {
        this.model = model;
        this.color = color;
        this.doorCount = doorCount;
        this.isElectric = isElectric;
        this.engineVolume = engineVolume;
    }

    public Car() {
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public String getLogo() {
        return logo;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
